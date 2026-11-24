.class public final La/pvi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n5d0;


# direct methods
.method public synthetic constructor <init>(La/n5d0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pvi;->a:B

    iput-object p1, p0, La/pvi;->b:La/n5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pvi;->a:B

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    iget-object v0, v0, La/pvi;->b:La/n5d0;

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v4, La/tpn0;

    .line 14
    .line 15
    check-cast v0, La/rti;

    .line 16
    .line 17
    iget-object v0, v0, La/rti;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/svi;

    .line 20
    .line 21
    new-instance v6, La/ywu;

    .line 22
    .line 23
    iget-object v1, v0, La/svi;->a:La/wyu;

    .line 24
    .line 25
    new-instance v5, La/zwu;

    .line 26
    .line 27
    new-instance v7, La/z220;

    .line 28
    .line 29
    new-instance v8, La/afm0;

    .line 30
    .line 31
    iget-object v9, v0, La/svi;->b:La/gii0;

    .line 32
    .line 33
    invoke-direct {v8, v9, v3}, La/afm0;-><init>(La/gii0;B)V

    .line 34
    .line 35
    .line 36
    iget-object v9, v0, La/svi;->c:La/knf0;

    .line 37
    .line 38
    iget-object v10, v0, La/svi;->d:La/yvn0;

    .line 39
    .line 40
    iget-object v11, v0, La/svi;->e:La/mne;

    .line 41
    .line 42
    invoke-direct {v7, v8, v9, v10, v11}, La/z220;-><init>(La/afm0;La/knf0;La/yvn0;La/mne;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v5, v7}, La/zwu;-><init>(La/z220;)V

    .line 46
    .line 47
    .line 48
    iget-object v7, v0, La/svi;->f:La/wgu;

    .line 49
    .line 50
    invoke-direct {v6, v1, v5, v7}, La/ywu;-><init>(La/wyu;La/zwu;La/wgu;)V

    .line 51
    .line 52
    .line 53
    iget-object v7, v0, La/svi;->e:La/mne;

    .line 54
    .line 55
    new-instance v8, La/kvu;

    .line 56
    .line 57
    new-instance v1, La/z220;

    .line 58
    .line 59
    new-instance v5, La/afm0;

    .line 60
    .line 61
    iget-object v9, v0, La/svi;->b:La/gii0;

    .line 62
    .line 63
    invoke-direct {v5, v9, v3}, La/afm0;-><init>(La/gii0;B)V

    .line 64
    .line 65
    .line 66
    iget-object v3, v0, La/svi;->c:La/knf0;

    .line 67
    .line 68
    iget-object v9, v0, La/svi;->d:La/yvn0;

    .line 69
    .line 70
    invoke-direct {v1, v5, v3, v9, v7}, La/z220;-><init>(La/afm0;La/knf0;La/yvn0;La/mne;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v8, v1}, La/kvu;-><init>(La/z220;)V

    .line 74
    .line 75
    .line 76
    iget-object v9, v0, La/svi;->g:La/i1w0;

    .line 77
    .line 78
    new-instance v10, La/m6m0;

    .line 79
    .line 80
    invoke-direct {v10, v2}, La/m6m0;-><init>(B)V

    .line 81
    .line 82
    .line 83
    iget-object v11, v0, La/svi;->h:La/s31;

    .line 84
    .line 85
    iget-object v12, v0, La/svi;->i:La/zx10;

    .line 86
    .line 87
    iget-object v13, v0, La/svi;->j:La/e41;

    .line 88
    .line 89
    iget-object v14, v0, La/svi;->k:La/ctf0;

    .line 90
    .line 91
    iget-object v15, v0, La/svi;->a:La/wyu;

    .line 92
    .line 93
    move-object/from16 v5, p1

    .line 94
    .line 95
    invoke-direct/range {v4 .. v15}, La/tpn0;-><init>(La/vzg0;La/ywu;La/mne;La/kvu;La/i1w0;La/m6m0;La/s31;La/zx10;La/e41;La/ctf0;La/wyu;)V

    .line 96
    .line 97
    .line 98
    return-object v4

    .line 99
    :pswitch_0
    new-instance v5, La/tpn0;

    .line 100
    .line 101
    check-cast v0, La/msi;

    .line 102
    .line 103
    iget-object v0, v0, La/msi;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, La/rvi;

    .line 106
    .line 107
    new-instance v7, La/ywu;

    .line 108
    .line 109
    iget-object v1, v0, La/rvi;->a:La/wyu;

    .line 110
    .line 111
    new-instance v4, La/zwu;

    .line 112
    .line 113
    new-instance v6, La/z220;

    .line 114
    .line 115
    new-instance v8, La/afm0;

    .line 116
    .line 117
    iget-object v9, v0, La/rvi;->b:La/gii0;

    .line 118
    .line 119
    invoke-direct {v8, v9, v3}, La/afm0;-><init>(La/gii0;B)V

    .line 120
    .line 121
    .line 122
    iget-object v9, v0, La/rvi;->c:La/knf0;

    .line 123
    .line 124
    iget-object v10, v0, La/rvi;->d:La/yvn0;

    .line 125
    .line 126
    iget-object v11, v0, La/rvi;->e:La/mne;

    .line 127
    .line 128
    invoke-direct {v6, v8, v9, v10, v11}, La/z220;-><init>(La/afm0;La/knf0;La/yvn0;La/mne;)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v4, v6}, La/zwu;-><init>(La/z220;)V

    .line 132
    .line 133
    .line 134
    new-instance v6, La/wgu;

    .line 135
    .line 136
    iget-object v8, v0, La/rvi;->f:La/yox;

    .line 137
    .line 138
    invoke-direct {v6, v8}, La/wgu;-><init>(La/yox;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v7, v1, v4, v6}, La/ywu;-><init>(La/wyu;La/zwu;La/wgu;)V

    .line 142
    .line 143
    .line 144
    iget-object v8, v0, La/rvi;->e:La/mne;

    .line 145
    .line 146
    new-instance v9, La/kvu;

    .line 147
    .line 148
    new-instance v1, La/z220;

    .line 149
    .line 150
    new-instance v4, La/afm0;

    .line 151
    .line 152
    iget-object v6, v0, La/rvi;->b:La/gii0;

    .line 153
    .line 154
    invoke-direct {v4, v6, v3}, La/afm0;-><init>(La/gii0;B)V

    .line 155
    .line 156
    .line 157
    iget-object v3, v0, La/rvi;->c:La/knf0;

    .line 158
    .line 159
    iget-object v6, v0, La/rvi;->d:La/yvn0;

    .line 160
    .line 161
    invoke-direct {v1, v4, v3, v6, v8}, La/z220;-><init>(La/afm0;La/knf0;La/yvn0;La/mne;)V

    .line 162
    .line 163
    .line 164
    invoke-direct {v9, v1}, La/kvu;-><init>(La/z220;)V

    .line 165
    .line 166
    .line 167
    iget-object v10, v0, La/rvi;->g:La/i1w0;

    .line 168
    .line 169
    new-instance v11, La/m6m0;

    .line 170
    .line 171
    invoke-direct {v11, v2}, La/m6m0;-><init>(B)V

    .line 172
    .line 173
    .line 174
    iget-object v12, v0, La/rvi;->h:La/s31;

    .line 175
    .line 176
    iget-object v13, v0, La/rvi;->i:La/zx10;

    .line 177
    .line 178
    iget-object v14, v0, La/rvi;->j:La/e41;

    .line 179
    .line 180
    iget-object v15, v0, La/rvi;->k:La/ctf0;

    .line 181
    .line 182
    iget-object v0, v0, La/rvi;->a:La/wyu;

    .line 183
    .line 184
    move-object/from16 v6, p1

    .line 185
    .line 186
    move-object/from16 v16, v0

    .line 187
    .line 188
    invoke-direct/range {v5 .. v16}, La/tpn0;-><init>(La/vzg0;La/ywu;La/mne;La/kvu;La/i1w0;La/m6m0;La/s31;La/zx10;La/e41;La/ctf0;La/wyu;)V

    .line 189
    .line 190
    .line 191
    return-object v5

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
