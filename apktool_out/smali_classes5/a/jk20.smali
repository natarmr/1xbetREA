.class public final synthetic La/jk20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nn20;

.field public final synthetic c:La/m97;


# direct methods
.method public synthetic constructor <init>(La/nn20;La/m97;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jk20;->a:B

    iput-object p1, p0, La/jk20;->b:La/nn20;

    iput-object p2, p0, La/jk20;->c:La/m97;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jk20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    move-object/from16 v5, p1

    .line 7
    .line 8
    check-cast v5, La/m97;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget v1, La/nn20;->c1:I

    .line 14
    .line 15
    new-instance v1, La/ni2;

    .line 16
    .line 17
    iget-object v4, v0, La/jk20;->b:La/nn20;

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    invoke-direct {v1, v4, v5, v9}, La/ni2;-><init>(La/nn20;La/m97;La/yje;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v9, v9, v1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 24
    .line 25
    .line 26
    iget-object v1, v4, La/nn20;->x:La/hsj;

    .line 27
    .line 28
    invoke-virtual {v1}, La/hsj;->t()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    new-instance v3, La/hnp;

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    iget-object v6, v0, La/jk20;->c:La/m97;

    .line 36
    .line 37
    invoke-direct/range {v3 .. v8}, La/hnp;-><init>(La/nn20;La/m97;La/m97;ZLa/yje;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v4, v9, v9, v3, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 41
    .line 42
    .line 43
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    iget-object v0, v4, La/nn20;->T:La/mne;

    .line 48
    .line 49
    iget-object v13, v0, La/mne;->a:La/rwj;

    .line 50
    .line 51
    sget-object v11, La/xk20;->a:La/xk20;

    .line 52
    .line 53
    new-instance v14, La/xn2;

    .line 54
    .line 55
    invoke-direct {v14, v4, v9, v2}, La/xn2;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    const/16 v15, 0xa

    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 62
    .line 63
    .line 64
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 65
    .line 66
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 67
    .line 68
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v2, v4, La/i3t0;->f:La/oyg0;

    .line 76
    .line 77
    move-object v5, v0

    .line 78
    check-cast v5, La/b820;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    const/16 v18, 0x17ff

    .line 86
    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v9, 0x0

    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v12, 0x0

    .line 94
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x0

    .line 96
    const/4 v15, 0x0

    .line 97
    const/16 v16, 0x0

    .line 98
    .line 99
    invoke-static/range {v5 .. v18}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_0

    .line 108
    .line 109
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_0
    new-instance v1, La/qc20;

    .line 113
    .line 114
    sget-object v7, La/pek0;->a:La/pek0;

    .line 115
    .line 116
    iget-object v4, v0, La/jk20;->b:La/nn20;

    .line 117
    .line 118
    iget-object v3, v4, La/nn20;->S:La/ctf0;

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    new-array v8, v6, [Ljava/lang/Object;

    .line 122
    .line 123
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 124
    .line 125
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const v8, 0x7f13023f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    sget-object v11, La/jdk0;->a:La/jdk0;

    .line 137
    .line 138
    new-instance v6, La/xdk0;

    .line 139
    .line 140
    const v3, 0x7f080be7

    .line 141
    .line 142
    .line 143
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    const/16 v13, 0x4c

    .line 148
    .line 149
    const/4 v9, 0x0

    .line 150
    const/4 v10, 0x0

    .line 151
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 152
    .line 153
    .line 154
    invoke-direct {v1, v6}, La/qc20;-><init>(La/xdk0;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    new-instance v3, La/xg0;

    .line 161
    .line 162
    const/16 v8, 0x11

    .line 163
    .line 164
    iget-object v6, v0, La/jk20;->c:La/m97;

    .line 165
    .line 166
    const/4 v7, 0x0

    .line 167
    invoke-direct/range {v3 .. v8}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 168
    .line 169
    .line 170
    invoke-static {v4, v7, v7, v3, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, La/nn20;->M0()V

    .line 174
    .line 175
    .line 176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
