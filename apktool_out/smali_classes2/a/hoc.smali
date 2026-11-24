.class public final La/hoc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La/hoc;

.field public static final c:La/hoc;

.field public static final d:La/hoc;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/hoc;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/hoc;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/hoc;->b:La/hoc;

    .line 8
    .line 9
    new-instance v0, La/hoc;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, La/hoc;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/hoc;->c:La/hoc;

    .line 16
    .line 17
    new-instance v0, La/hoc;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, La/hoc;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/hoc;->d:La/hoc;

    .line 24
    .line 25
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/hoc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(La/foc;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-interface {p0}, La/vjj;->getName()La/g950;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, La/xdx;->A(La/g950;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, p0, La/hzs0;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-interface {p0}, La/vjj;->j()La/vjj;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    instance-of v1, p0, La/wm40;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast p0, La/foc;

    .line 29
    .line 30
    invoke-static {p0}, La/hoc;->a(La/foc;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    instance-of v1, p0, La/mg80;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    check-cast p0, La/mg80;

    .line 40
    .line 41
    check-cast p0, La/ng80;

    .line 42
    .line 43
    iget-object p0, p0, La/ng80;->f:La/swq;

    .line 44
    .line 45
    iget-object p0, p0, La/swq;->a:La/twq;

    .line 46
    .line 47
    invoke-static {p0}, La/xdx;->z(La/twq;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 p0, 0x0

    .line 53
    :goto_0
    if-eqz p0, :cond_3

    .line 54
    .line 55
    const-string v1, ""

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/16 p0, 0x2e

    .line 69
    .line 70
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_3
    :goto_1
    return-object v0
.end method


# virtual methods
.method public final b(La/foc;La/iek;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte p0, p0, La/hoc;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, La/hoc;->a(La/foc;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    instance-of p0, p1, La/hzs0;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    check-cast p1, La/hzs0;

    .line 20
    .line 21
    invoke-interface {p1}, La/vjj;->getName()La/g950;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p0, v0}, La/iek;->F(La/g950;Z)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-interface {p1}, La/vjj;->getName()La/g950;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, La/vjj;->j()La/vjj;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    instance-of p2, p1, La/wm40;

    .line 50
    .line 51
    if-nez p2, :cond_1

    .line 52
    .line 53
    new-instance p1, La/yag0;

    .line 54
    .line 55
    invoke-direct {p1, p0}, La/yag0;-><init>(Ljava/util/ArrayList;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, La/xdx;->C(Ljava/util/List;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_0
    return-object p0

    .line 63
    :pswitch_1
    instance-of p0, p1, La/hzs0;

    .line 64
    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    check-cast p1, La/hzs0;

    .line 68
    .line 69
    invoke-interface {p1}, La/vjj;->getName()La/g950;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p0, v0}, La/iek;->F(La/g950;Z)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-static {p1}, La/oek;->f(La/vjj;)La/twq;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, La/twq;->f(La/twq;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, La/xdx;->C(Ljava/util/List;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p2, p0}, La/iek;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    :goto_1
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
