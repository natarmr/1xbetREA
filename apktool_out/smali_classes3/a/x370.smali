.class public final synthetic La/x370;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y370;


# direct methods
.method public synthetic constructor <init>(La/y370;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x370;->a:B

    iput-object p1, p0, La/x370;->b:La/y370;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/x370;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x370;->b:La/y370;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/y370;->Y1:La/wsz;

    .line 9
    .line 10
    new-instance v0, La/p270;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, La/a4n0;->e(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, v1, v2, p0}, La/p270;-><init>(La/kxq;Landroidx/fragment/app/e;La/i1w0;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    iget-object v0, p0, La/y370;->L1:La/hdo0;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-object v1, p0, La/y370;->V1:La/a8z;

    .line 36
    .line 37
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, La/r270;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v2, v0, La/hdo0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    iget-object v0, v0, La/hdo0;->a:La/o1w0;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v3, La/i1w0;

    .line 60
    .line 61
    invoke-direct {v3}, La/i1w0;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v3}, La/o1w0;->a(La/i1w0;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, La/ejc;

    .line 68
    .line 69
    invoke-direct {v0, v3}, La/ejc;-><init>(La/i1w0;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_0

    .line 77
    .line 78
    move-object v3, v0

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move-object v3, v1

    .line 81
    :cond_1
    :goto_0
    check-cast v3, La/ejc;

    .line 82
    .line 83
    iget-object v0, p0, La/y370;->R1:La/cgx0;

    .line 84
    .line 85
    sget-object v1, La/y370;->Z1:[La/iiy;

    .line 86
    .line 87
    const/4 v2, 0x2

    .line 88
    aget-object v1, v1, v2

    .line 89
    .line 90
    invoke-virtual {v0, p0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    iget-object v0, v3, La/ejc;->a:La/i1w0;

    .line 101
    .line 102
    new-instance v1, La/cd60;

    .line 103
    .line 104
    const/16 v2, 0xd

    .line 105
    .line 106
    invoke-direct {v1, p0, v2}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 110
    .line 111
    .line 112
    :cond_2
    return-object v3

    .line 113
    :cond_3
    const-string p0, "oneXGamesTabRouterHolder"

    .line 114
    .line 115
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const/4 p0, 0x0

    .line 119
    throw p0

    .line 120
    :pswitch_1
    iget-object v0, p0, La/y370;->P1:La/phf0;

    .line 121
    .line 122
    sget-object v1, La/y370;->Z1:[La/iiy;

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    aget-object v1, v1, v2

    .line 126
    .line 127
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, La/r270;->valueOf(Ljava/lang/String;)La/r270;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
