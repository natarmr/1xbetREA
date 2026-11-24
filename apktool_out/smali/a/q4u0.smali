.class public abstract La/q4u0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/iun;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/iun;->a:La/iun;

    .line 2
    .line 3
    sput-object v0, La/q4u0;->a:La/iun;

    .line 4
    .line 5
    sget v0, La/y3d;->h:I

    .line 6
    .line 7
    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, La/q4u0;->a:La/iun;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, La/kd30;

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    invoke-direct {v0, v1}, La/kd30;-><init>(B)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/kd30;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, La/kd30;->a:Ljava/lang/Object;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0, p0, v1}, La/kd30;->R(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, v0, La/kd30;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ljava/util/ArrayList;

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_2
    sget-object p0, La/iun;->a:La/iun;

    .line 40
    .line 41
    return-object p0
.end method
