.class public final La/ljf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/g1q0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/g6m0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sparse-switch p2, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p2, La/rta0;

    .line 11
    .line 12
    const/16 v0, 0x17

    .line 13
    .line 14
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p2, La/enj0;

    .line 24
    .line 25
    const/16 v0, 0x8

    .line 26
    .line 27
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance p2, La/enj0;

    .line 37
    .line 38
    const/4 v0, 0x7

    .line 39
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    return-void

    .line 45
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance p2, La/enj0;

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 52
    .line 53
    .line 54
    iput-object p2, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    return-void

    .line 57
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance p2, La/rta0;

    .line 61
    .line 62
    const/16 v0, 0x19

    .line 63
    .line 64
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1b -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/j1q0;La/rtu;La/ort;La/x1u;La/ieu;La/cs00;La/lsn;La/gii0;La/ehf0;La/knf0;La/uzc;La/v8v;La/pru;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance p1, La/o3c;

    move-object p5, p11

    move-object p11, p10

    move-object p10, p5

    move-object p5, p3

    move-object p3, p6

    move-object p6, p4

    move-object p4, p2

    move-object p2, p7

    move-object p7, p8

    move-object p8, p9

    move-object p9, p12

    move-object p12, p13

    invoke-direct/range {p1 .. p12}, La/o3c;-><init>(La/lsn;La/cs00;La/rtu;La/ort;La/x1u;La/gii0;La/ehf0;La/v8v;La/uzc;La/knf0;La/pru;)V

    .line 97
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/m6d0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/neu0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ost0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/q530;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/r200;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/tnc0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/xjj0;)V
    .locals 2

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iget-object p1, p1, La/xjj0;->a:Ljava/lang/Object;

    check-cast p1, La/q7d0;

    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    new-instance v0, La/yqc;

    const/16 v1, 0x13

    invoke-direct {v0, p1, v1}, La/yqc;-><init>(Ljava/lang/Object;B)V

    .line 92
    iput-object v0, p0, La/ljf0;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 87
    iput-object p1, p0, La/ljf0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/wdu;
    .locals 11

    .line 1
    iget-object p0, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/o3c;

    .line 4
    .line 5
    new-instance v0, La/wdu;

    .line 6
    .line 7
    new-instance v1, La/lhf0;

    .line 8
    .line 9
    iget-object v2, p0, La/o3c;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/uzc;

    .line 12
    .line 13
    invoke-virtual {p0}, La/o3c;->v()La/gxu;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v4, p0, La/o3c;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, La/ehf0;

    .line 20
    .line 21
    invoke-direct {v1, v2, v3, v4}, La/lhf0;-><init>(La/uzc;La/gxu;La/ehf0;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/ocl;

    .line 25
    .line 26
    invoke-virtual {p0}, La/o3c;->v()La/gxu;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-direct {v2, v3}, La/ocl;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, La/o3c;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, La/lsn;

    .line 36
    .line 37
    iget-object v3, v3, La/lsn;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, La/gbi;

    .line 40
    .line 41
    invoke-virtual {v3}, La/gbi;->k()La/v7i;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-object v4, p0, La/o3c;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, La/rtu;

    .line 48
    .line 49
    iget-object v5, p0, La/o3c;->h:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, La/cs00;

    .line 52
    .line 53
    invoke-interface {v5}, La/cs00;->d()La/viu;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    new-instance v6, La/yk50;

    .line 58
    .line 59
    invoke-virtual {p0}, La/o3c;->v()La/gxu;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    const/16 v8, 0x1a

    .line 64
    .line 65
    invoke-direct {v6, v7, v8}, La/yk50;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    iget-object v7, p0, La/o3c;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v7, La/ort;

    .line 71
    .line 72
    iget-object v8, p0, La/o3c;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v8, La/x1u;

    .line 75
    .line 76
    iget-object p0, p0, La/o3c;->k:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v9, p0

    .line 79
    check-cast v9, La/pru;

    .line 80
    .line 81
    const/4 v10, 0x3

    .line 82
    invoke-direct/range {v0 .. v10}, La/wdu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method

.method public b(JLa/zje;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/q530;

    .line 4
    .line 5
    iget-object p0, p0, La/q530;->a:La/n530;

    .line 6
    .line 7
    iget-object p0, p0, La/n530;->c:La/qoj0;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Long;

    .line 10
    .line 11
    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p3}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, La/wne;->a:La/wne;

    .line 19
    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    :goto_0
    if-ne p0, p1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    :goto_1
    if-ne p0, p1, :cond_2

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    iget-object p0, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/iw20;

    .line 4
    .line 5
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/y3v;

    .line 8
    .line 9
    iget-object v0, p0, La/y3v;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/vby;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v1, La/zw3;

    .line 17
    .line 18
    sget-object v2, La/okx;->a:La/okx;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, v2, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, p1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p0, p0, La/y3v;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, La/vwb0;

    .line 31
    .line 32
    const-string v0, "saved_section_quick_available"

    .line 33
    .line 34
    invoke-virtual {p0, v0, p1}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/tnc0;

    .line 4
    .line 5
    iget-object p0, p0, La/tnc0;->b:La/dnc0;

    .line 6
    .line 7
    iput-boolean p1, p0, La/dnc0;->b:Z

    .line 8
    .line 9
    return-void
.end method

.method public e(La/zzc0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/HashMap;

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method
