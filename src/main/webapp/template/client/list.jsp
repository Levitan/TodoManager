<%@include file="tpl/header.jsp" %>

<div class="span9">
    <div class="widget-box">
        <div class="widget-title"><span class="icon"> <i class="icon-ok-sign"></i> </span>
            <h5>Labels and badges</h5>
        </div>
            <table class="table table-striped">
                <thead class="thead-default">
                <tr>
                    <th>ID</th>
                    <th>Satus</th>
                    <th>Title</th>
                    <th>Type</th>
                    <th>Category</th>
                    <th>Creation date</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${tasks}" var="task">
                    <tr>
                        <td>${task.id}</td>
                        <td>
                            <c:choose>
                                <c:when test="${task.status == types.STATUS_CLOSED}">Closed</c:when>
                                <c:when test="${task.status == types.STATUS_IN_PROGRESS}">In progress</c:when>
                                <c:when test="${task.status == types.STATUS_NOT_A_BUG}">Not a bug</c:when>
                                <c:when test="${task.status == types.STATUS_OPEN}">Open</c:when>
                                <c:when test="${task.status == types.STATUS_REOPEN}">Reopen</c:when>
                                <c:when test="${task.status == types.STATUS_RESOLVED}">Resolved</c:when>
                                <c:when test="${task.status == types.STATUS_ON_HOLD}">On hold</c:when>
                            </c:choose>
                        </td>
                        <td>${task.title}</td>
                        <td>
                            <c:choose>
                                <c:when test="${task.type == types.TYPE_BUG}">Bug</c:when>
                                <c:when test="${task.type == types.TYPE_NEW_FEATURE}">New feature</c:when>
                                <c:when test="${task.type == types.TYPE_IMPROVMENT}">Improvement</c:when>
                            </c:choose>
                        </td>
                        <td>${task.category}</td>
                        <td>${task.createDate}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
    </div>
</div>
<div class="span3">
    <div class="widget-box">
        <div class="widget-title"><span class="icon"> <i class="icon-ok-sign"></i> </span>
            <h5>Labels and badges</h5>
        </div>
        <div class="widget-content">

        </div>

    </div>
</div>
<%@include file="tpl/footer.jsp" %>