.class public final La/mnu0;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final b:La/mnu0;

.field public static final c:La/mnu0;

.field public static final d:La/mnu0;

.field public static final e:La/mnu0;

.field public static final f:La/mnu0;

.field public static final g:La/mnu0;

.field public static final h:La/mnu0;

.field public static final i:La/mnu0;

.field public static final j:La/mnu0;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/mnu0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, La/mnu0;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/mnu0;->b:La/mnu0;

    .line 9
    .line 10
    new-instance v0, La/mnu0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, La/mnu0;-><init>(IB)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/mnu0;->c:La/mnu0;

    .line 17
    .line 18
    new-instance v0, La/mnu0;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, La/mnu0;-><init>(IB)V

    .line 22
    .line 23
    .line 24
    sput-object v0, La/mnu0;->d:La/mnu0;

    .line 25
    .line 26
    new-instance v0, La/mnu0;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, La/mnu0;-><init>(IB)V

    .line 30
    .line 31
    .line 32
    sput-object v0, La/mnu0;->e:La/mnu0;

    .line 33
    .line 34
    new-instance v0, La/mnu0;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, La/mnu0;-><init>(IB)V

    .line 38
    .line 39
    .line 40
    sput-object v0, La/mnu0;->f:La/mnu0;

    .line 41
    .line 42
    new-instance v0, La/mnu0;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v1, v2}, La/mnu0;-><init>(IB)V

    .line 46
    .line 47
    .line 48
    sput-object v0, La/mnu0;->g:La/mnu0;

    .line 49
    .line 50
    new-instance v0, La/mnu0;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v0, v1, v2}, La/mnu0;-><init>(IB)V

    .line 54
    .line 55
    .line 56
    sput-object v0, La/mnu0;->h:La/mnu0;

    .line 57
    .line 58
    new-instance v0, La/mnu0;

    .line 59
    .line 60
    const/4 v2, 0x7

    .line 61
    invoke-direct {v0, v1, v2}, La/mnu0;-><init>(IB)V

    .line 62
    .line 63
    .line 64
    sput-object v0, La/mnu0;->i:La/mnu0;

    .line 65
    .line 66
    new-instance v0, La/mnu0;

    .line 67
    .line 68
    const/16 v2, 0x8

    .line 69
    .line 70
    invoke-direct {v0, v1, v2}, La/mnu0;-><init>(IB)V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/mnu0;->j:La/mnu0;

    .line 74
    .line 75
    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mnu0;->a:B

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p0, p0, La/mnu0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/qkx;

    .line 7
    .line 8
    iget-wide p0, p1, La/qkx;->a:J

    .line 9
    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    shr-long/2addr p0, v0

    .line 13
    long-to-int p0, p0

    .line 14
    int-to-long p0, p0

    .line 15
    shl-long/2addr p0, v0

    .line 16
    const/4 v0, 0x0

    .line 17
    int-to-long v0, v0

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v0, v2

    .line 24
    or-long/2addr p0, v0

    .line 25
    new-instance v0, La/qkx;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1}, La/qkx;-><init>(J)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    check-cast p1, La/qkx;

    .line 32
    .line 33
    iget-wide p0, p1, La/qkx;->a:J

    .line 34
    .line 35
    const/16 v0, 0x20

    .line 36
    .line 37
    shr-long/2addr p0, v0

    .line 38
    long-to-int p0, p0

    .line 39
    int-to-long p0, p0

    .line 40
    shl-long/2addr p0, v0

    .line 41
    const/4 v0, 0x0

    .line 42
    int-to-long v0, v0

    .line 43
    const-wide v2, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v0, v2

    .line 49
    or-long/2addr p0, v0

    .line 50
    new-instance v0, La/qkx;

    .line 51
    .line 52
    invoke-direct {v0, p0, p1}, La/qkx;-><init>(J)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_1
    check-cast p1, Landroid/view/ViewGroup;

    .line 57
    .line 58
    invoke-static {p1}, La/rw2;->e(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, Landroid/view/ViewGroup;

    .line 64
    .line 65
    invoke-static {p1}, La/rw2;->e(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_3
    check-cast p1, Landroid/view/ViewGroup;

    .line 71
    .line 72
    invoke-static {p1}, La/rw2;->e(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_4
    check-cast p1, Landroid/view/ViewGroup;

    .line 78
    .line 79
    invoke-static {p1}, La/rw2;->e(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_5
    check-cast p1, Landroid/view/ViewGroup;

    .line 85
    .line 86
    invoke-static {p1}, La/rw2;->e(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_6
    check-cast p1, Landroid/view/ViewGroup;

    .line 92
    .line 93
    invoke-static {p1}, La/rw2;->e(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_7
    check-cast p1, Landroid/view/ViewGroup;

    .line 99
    .line 100
    invoke-static {p1}, La/rw2;->e(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_8
    check-cast p1, Landroid/view/ViewGroup;

    .line 106
    .line 107
    invoke-static {p1}, La/rw2;->e(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_9
    check-cast p1, Landroid/view/ViewGroup;

    .line 113
    .line 114
    invoke-static {p1}, La/rw2;->e(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
