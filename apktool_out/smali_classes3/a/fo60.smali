.class public final synthetic La/fo60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lo60;


# direct methods
.method public synthetic constructor <init>(La/lo60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fo60;->a:B

    iput-object p1, p0, La/fo60;->b:La/lo60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/fo60;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/fo60;->b:La/lo60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/lo60;->U1:La/htz;

    .line 9
    .line 10
    invoke-virtual {p0}, La/lo60;->H0()La/sp70;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object v0, p0, La/sp70;->l:La/fqx;

    .line 15
    .line 16
    iget-object v1, p0, La/sp70;->r:La/vcu;

    .line 17
    .line 18
    iget-object v2, p0, La/sp70;->L:La/khf0;

    .line 19
    .line 20
    invoke-virtual {v2}, La/khf0;->F()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    new-instance v2, La/sle;

    .line 27
    .line 28
    iget-object v3, p0, La/sp70;->g:La/ztt;

    .line 29
    .line 30
    invoke-virtual {v3}, La/ztt;->a()La/csr;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-direct {v2, v3}, La/sle;-><init>(La/csr;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, La/sp70;->w(La/zy5;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object v2, p0, La/sp70;->F:La/hsj0;

    .line 41
    .line 42
    iget-object v2, v2, La/hsj0;->a:La/pbt;

    .line 43
    .line 44
    iget-object v2, v2, La/pbt;->a:La/j5t;

    .line 45
    .line 46
    iget-boolean v2, v2, La/j5t;->A:Z

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, La/vrs;->a()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_5

    .line 59
    .line 60
    :cond_1
    invoke-virtual {v0}, La/fqx;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, La/vrs;->a()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {v0}, La/fqx;->a()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    iget-object v0, p0, La/sp70;->x:La/hj50;

    .line 84
    .line 85
    iget-object v0, v0, La/hj50;->a:La/pbt;

    .line 86
    .line 87
    iget-object v0, v0, La/pbt;->b:La/lsn;

    .line 88
    .line 89
    iget-object v0, v0, La/lsn;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Landroid/content/SharedPreferences;

    .line 92
    .line 93
    const-string v2, "SHOW_GAME_IS_NOT_FINISHED_DIALOG"

    .line 94
    .line 95
    const/4 v3, 0x1

    .line 96
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, La/vrs;->a()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    iget-object v0, p0, La/sp70;->w:La/spx;

    .line 113
    .line 114
    invoke-virtual {v0}, La/spx;->a()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_4

    .line 119
    .line 120
    :cond_3
    new-instance v0, La/gp70;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v0}, La/sp70;->F(La/hp70;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_4
    new-instance v0, La/iy5;

    .line 130
    .line 131
    sget-object v1, La/csr;->e:La/csr;

    .line 132
    .line 133
    invoke-direct {v0, v1}, La/iy5;-><init>(La/csr;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0}, La/sp70;->w(La/zy5;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, La/sp70;->B()V

    .line 140
    .line 141
    .line 142
    :cond_5
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_0
    sget-object v0, La/lo60;->U1:La/htz;

    .line 146
    .line 147
    new-instance v0, La/ko60;

    .line 148
    .line 149
    const/4 v1, 0x0

    .line 150
    invoke-direct {v0, p0, v1}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
