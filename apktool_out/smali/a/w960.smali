.class public abstract La/w960;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/Object;

.field public static final b:La/vy40;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v1, La/w960;->a:[Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v1, La/vy40;

    .line 7
    .line 8
    invoke-direct {v1, v0}, La/vy40;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v1, La/w960;->b:La/vy40;

    .line 12
    .line 13
    return-void
.end method

.method public static final a(ILjava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    if-ge p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, " is out of bounds. The list has "

    .line 11
    .line 12
    const-string v1, " elements."

    .line 13
    .line 14
    const-string v2, "Index "

    .line 15
    .line 16
    invoke-static {v2, p0, v0, v1, p1}, La/ohs0;->m(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, La/v4i0;->m(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static final b(IILjava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-gt p0, p1, :cond_2

    .line 6
    .line 7
    if-ltz p0, :cond_1

    .line 8
    .line 9
    if-gt p1, p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, ") is more than than the list size ("

    .line 13
    .line 14
    const-string v0, ")"

    .line 15
    .line 16
    const-string v1, "toIndex ("

    .line 17
    .line 18
    invoke-static {v1, p1, p0, v0, p2}, La/ohs0;->m(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, La/v4i0;->m(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p1, "fromIndex ("

    .line 27
    .line 28
    const-string p2, ") is less than 0."

    .line 29
    .line 30
    invoke-static {p0, p1, p2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, La/v4i0;->m(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    const-string p2, ") is greater than toIndex ("

    .line 39
    .line 40
    const-string v0, ")."

    .line 41
    .line 42
    const-string v1, "Indices are out of order. fromIndex ("

    .line 43
    .line 44
    invoke-static {v1, p0, p2, v0, p1}, La/ohs0;->m(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
