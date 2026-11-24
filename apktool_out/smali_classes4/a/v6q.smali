.class public final La/v6q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/h7q;


# direct methods
.method public constructor <init>(La/h7q;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/v6q;->a:La/h7q;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/v6q;->a:La/h7q;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/v6q;->a:La/h7q;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(ILa/wbq;)D
    .locals 2

    .line 1
    iget-object p0, p0, La/v6q;->a:La/h7q;

    .line 2
    .line 3
    iget-object p0, p0, La/h7q;->c:La/q6q;

    .line 4
    .line 5
    iget-object p0, p0, La/q6q;->d:La/p7m0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/util/List;

    .line 12
    .line 13
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v0, La/t3t;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p2, v1}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v0}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance p2, La/vls;

    .line 28
    .line 29
    const/16 v0, 0x1b

    .line 30
    .line 31
    invoke-direct {p2, v0}, La/vls;-><init>(B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p2}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-gez p1, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {p0}, La/qls0;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const/4 p2, 0x0

    .line 46
    :goto_0
    move-object v0, p0

    .line 47
    check-cast v0, La/pls0;

    .line 48
    .line 49
    invoke-virtual {v0}, La/pls0;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, La/pls0;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    add-int/lit8 v1, p2, 0x1

    .line 60
    .line 61
    if-ne p1, p2, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    move p2, v1

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 67
    :goto_2
    check-cast v0, La/quo;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-wide p0, v0, La/quo;->a:D

    .line 72
    .line 73
    return-wide p0

    .line 74
    :cond_3
    const-wide/16 p0, 0x0

    .line 75
    .line 76
    return-wide p0
.end method

.method public b(I)V
    .locals 1

    .line 1
    iget-object p0, p0, La/v6q;->a:La/h7q;

    .line 2
    .line 3
    iget-object p0, p0, La/h7q;->c:La/q6q;

    .line 4
    .line 5
    iget-object p0, p0, La/q6q;->a:La/p7m0;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
