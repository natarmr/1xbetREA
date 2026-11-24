.class public final La/i9u0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:La/u8u;

.field public final d:La/bbw0;

.field public final e:La/ilp0;

.field public final f:La/mne;

.field public final g:La/p7m0;

.field public final h:La/qoj0;

.field public final i:La/ra10;

.field public final j:La/ra10;


# direct methods
.method public constructor <init>(La/i1w0;ILa/u8u;La/bbw0;La/ilp0;La/mne;La/sa10;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/i9u0;->b:La/i1w0;

    .line 8
    .line 9
    iput-object p3, p0, La/i9u0;->c:La/u8u;

    .line 10
    .line 11
    iput-object p4, p0, La/i9u0;->d:La/bbw0;

    .line 12
    .line 13
    iput-object p5, p0, La/i9u0;->e:La/ilp0;

    .line 14
    .line 15
    move-object v0, p6

    .line 16
    iput-object v0, p0, La/i9u0;->f:La/mne;

    .line 17
    .line 18
    sget-object v0, La/e9u0;->a:La/e9u0;

    .line 19
    .line 20
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, La/i9u0;->g:La/p7m0;

    .line 25
    .line 26
    invoke-static {}, La/ckb;->F()La/qoj0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, La/i9u0;->h:La/qoj0;

    .line 31
    .line 32
    sget-object v8, La/pb10;->g:La/pb10;

    .line 33
    .line 34
    new-instance v0, La/avs0;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v1, 0x0

    .line 39
    const-class v3, La/i9u0;

    .line 40
    .line 41
    const-string v4, "onRefreshData"

    .line 42
    .line 43
    const-string v5, "onRefreshData()V"

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    invoke-direct/range {v0 .. v7}, La/avs0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 47
    .line 48
    .line 49
    move-object v5, v0

    .line 50
    move-object v7, v3

    .line 51
    const/16 v6, 0x10

    .line 52
    .line 53
    const v3, 0x7f130674

    .line 54
    .line 55
    .line 56
    const v4, 0x7f131111

    .line 57
    .line 58
    .line 59
    move-object/from16 v1, p7

    .line 60
    .line 61
    move-object v2, v8

    .line 62
    invoke-static/range {v1 .. v6}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iput-object v3, p0, La/i9u0;->i:La/ra10;

    .line 67
    .line 68
    new-instance v5, La/avs0;

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    move-object v3, v7

    .line 72
    const/4 v7, 0x3

    .line 73
    const/4 v1, 0x0

    .line 74
    const-string v4, "onRefreshData"

    .line 75
    .line 76
    move-object v0, v5

    .line 77
    const-string v5, "onRefreshData()V"

    .line 78
    .line 79
    move-object v2, p0

    .line 80
    invoke-direct/range {v0 .. v7}, La/avs0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 81
    .line 82
    .line 83
    move-object v5, v0

    .line 84
    const/16 v6, 0x10

    .line 85
    .line 86
    const v3, 0x7f130677

    .line 87
    .line 88
    .line 89
    const v4, 0x7f131111

    .line 90
    .line 91
    .line 92
    move-object/from16 v1, p7

    .line 93
    .line 94
    move-object v2, v8

    .line 95
    invoke-static/range {v1 .. v6}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iput-object v1, p0, La/i9u0;->j:La/ra10;

    .line 100
    .line 101
    sget-object v1, La/mbu0;->b:La/svs0;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {p2}, La/svs0;->a(I)La/mbu0;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    sget-object v2, La/mbu0;->c:La/mbu0;

    .line 111
    .line 112
    if-eq v1, v2, :cond_0

    .line 113
    .line 114
    new-instance v2, La/c9u0;

    .line 115
    .line 116
    const/4 v3, 0x0

    .line 117
    invoke-direct {v2, p0, v1, v3}, La/c9u0;-><init>(La/i9u0;La/mbu0;B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 121
    .line 122
    .line 123
    :cond_0
    return-void
.end method
