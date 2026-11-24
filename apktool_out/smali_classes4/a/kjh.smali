.class public final synthetic La/kjh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mjh;


# direct methods
.method public synthetic constructor <init>(La/mjh;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kjh;->a:B

    iput-object p1, p0, La/kjh;->b:La/mjh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/kjh;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/kjh;->b:La/mjh;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/mjh;->Q1:La/std;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    instance-of v2, v0, La/af3;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    check-cast v0, La/af3;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v1

    .line 30
    :goto_0
    const-class v2, La/njh;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/o5d0;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/ze3;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v0, v1

    .line 54
    :goto_1
    instance-of v3, v0, La/njh;

    .line 55
    .line 56
    if-nez v3, :cond_2

    .line 57
    .line 58
    move-object v0, v1

    .line 59
    :cond_2
    check-cast v0, La/njh;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-object v1, p0, La/mjh;->P1:La/khf0;

    .line 64
    .line 65
    sget-object v2, La/mjh;->R1:[La/iiy;

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    aget-object v2, v2, v3

    .line 69
    .line 70
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    move-object v8, p0

    .line 75
    check-cast v8, Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;

    .line 76
    .line 77
    iget-object v5, v0, La/njh;->a:La/oeg0;

    .line 78
    .line 79
    iget-object v6, v0, La/njh;->b:La/g2v;

    .line 80
    .line 81
    iget-object v2, v0, La/njh;->c:La/cad;

    .line 82
    .line 83
    iget-object v7, v0, La/njh;->d:La/m1e;

    .line 84
    .line 85
    iget-object v4, v0, La/njh;->h:La/pyg;

    .line 86
    .line 87
    iget-object p0, v0, La/njh;->e:La/iip;

    .line 88
    .line 89
    iget-object v1, v0, La/njh;->g:La/xri;

    .line 90
    .line 91
    iget-object v9, v0, La/njh;->i:La/ctf0;

    .line 92
    .line 93
    iget-object v3, v0, La/njh;->j:La/gii0;

    .line 94
    .line 95
    move-object v10, v3

    .line 96
    iget-object v3, v0, La/njh;->f:La/clc;

    .line 97
    .line 98
    iget-object v0, v0, La/njh;->k:La/vby;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance v1, La/xei;

    .line 125
    .line 126
    invoke-direct/range {v1 .. v9}, La/xei;-><init>(La/cad;La/clc;La/pyg;La/oeg0;La/g2v;La/m1e;Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;La/ctf0;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 131
    .line 132
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :goto_2
    return-object v1

    .line 140
    :pswitch_0
    sget-object v0, La/mjh;->Q1:La/std;

    .line 141
    .line 142
    iget-object p0, p0, La/mjh;->L1:La/fiu0;

    .line 143
    .line 144
    if-eqz p0, :cond_4

    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_4
    const-string p0, "viewModelFactory"

    .line 148
    .line 149
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v1

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
