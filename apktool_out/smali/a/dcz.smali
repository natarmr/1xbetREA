.class public final La/dcz;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/qai0;


# instance fields
.field public o:Lkotlin/jvm/functions/Function0;

.field public p:La/xbz;

.field public q:La/ma80;

.field public r:Z

.field public s:Z

.field public t:La/t9h0;

.field public final u:La/bcz;

.field public v:La/bcz;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;La/xbz;La/ma80;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dcz;->o:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    iput-object p2, p0, La/dcz;->p:La/xbz;

    .line 7
    .line 8
    iput-object p3, p0, La/dcz;->q:La/ma80;

    .line 9
    .line 10
    iput-boolean p4, p0, La/dcz;->r:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/dcz;->s:Z

    .line 13
    .line 14
    new-instance p1, La/bcz;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p0, p2}, La/bcz;-><init>(La/dcz;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/dcz;->u:La/bcz;

    .line 21
    .line 22
    invoke-virtual {p0}, La/dcz;->Z0()V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final O0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Z0()V
    .locals 4

    .line 1
    new-instance v0, La/t9h0;

    .line 2
    .line 3
    new-instance v1, La/ccz;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, La/ccz;-><init>(La/dcz;B)V

    .line 7
    .line 8
    .line 9
    new-instance v2, La/ccz;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, p0, v3}, La/ccz;-><init>(La/dcz;B)V

    .line 13
    .line 14
    .line 15
    iget-boolean v3, p0, La/dcz;->s:Z

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3}, La/t9h0;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/dcz;->t:La/t9h0;

    .line 21
    .line 22
    iget-boolean v0, p0, La/dcz;->r:Z

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v0, La/bcz;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, v1}, La/bcz;-><init>(La/dcz;B)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    iput-object v0, p0, La/dcz;->v:La/bcz;

    .line 35
    .line 36
    return-void
.end method

.method public final x0(La/abi0;)V
    .locals 7

    .line 1
    invoke-static {p1}, La/yai0;->j(La/abi0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/dcz;->u:La/bcz;

    .line 5
    .line 6
    sget-object v1, La/xai0;->P:La/zai0;

    .line 7
    .line 8
    invoke-interface {p1, v1, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/dcz;->q:La/ma80;

    .line 12
    .line 13
    sget-object v1, La/ma80;->a:La/ma80;

    .line 14
    .line 15
    iget-object v2, p0, La/dcz;->t:La/t9h0;

    .line 16
    .line 17
    const-string v3, "scrollAxisRange"

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    sget-object v0, La/xai0;->w:La/zai0;

    .line 25
    .line 26
    sget-object v1, La/yai0;->a:[La/iiy;

    .line 27
    .line 28
    const/16 v3, 0xd

    .line 29
    .line 30
    aget-object v3, v1, v3

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0, v2}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v4

    .line 43
    :cond_1
    if-eqz v2, :cond_3

    .line 44
    .line 45
    sget-object v0, La/xai0;->v:La/zai0;

    .line 46
    .line 47
    sget-object v1, La/yai0;->a:[La/iiy;

    .line 48
    .line 49
    const/16 v3, 0xc

    .line 50
    .line 51
    aget-object v3, v1, v3

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, v0, v2}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object v0, p0, La/dcz;->v:La/bcz;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    sget-object v2, La/mai0;->f:La/zai0;

    .line 64
    .line 65
    new-instance v3, La/m6;

    .line 66
    .line 67
    invoke-direct {v3, v4, v0}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v2, v3}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    new-instance v0, La/ccz;

    .line 74
    .line 75
    const/4 v2, 0x2

    .line 76
    invoke-direct {v0, p0, v2}, La/ccz;-><init>(La/dcz;B)V

    .line 77
    .line 78
    .line 79
    sget-object v2, La/mai0;->C:La/zai0;

    .line 80
    .line 81
    new-instance v3, La/m6;

    .line 82
    .line 83
    new-instance v5, La/rai0;

    .line 84
    .line 85
    const/4 v6, 0x1

    .line 86
    invoke-direct {v5, v0, v6}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v3, v4, v5}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v2, v3}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, La/dcz;->p:La/xbz;

    .line 96
    .line 97
    invoke-interface {p0}, La/xbz;->c()La/m3d;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    sget-object v0, La/xai0;->f:La/zai0;

    .line 102
    .line 103
    const/16 v2, 0x18

    .line 104
    .line 105
    aget-object v1, v1, v2

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v4
.end method
