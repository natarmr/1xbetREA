.class public final synthetic La/do0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qo0;


# direct methods
.method public synthetic constructor <init>(La/qo0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/do0;->a:B

    iput-object p1, p0, La/do0;->b:La/qo0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/do0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/do0;->b:La/qo0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/jfp;

    .line 18
    .line 19
    iget-object v3, v0, La/qo0;->x:La/ctf0;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    new-instance v1, La/jn0;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    new-array v4, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v5, v3, La/ctf0;->b:La/lsm0;

    .line 29
    .line 30
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const v6, 0x7f1307bb

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    new-array v5, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v6, v3, La/ctf0;->b:La/lsm0;

    .line 44
    .line 45
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const v7, 0x7f1303d7

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-array v6, v2, [Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 59
    .line 60
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const v6, 0x7f130e5d

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-direct {v1, v4, v5, v2}, La/jn0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    new-instance v2, La/in0;

    .line 79
    .line 80
    invoke-static {v1, v3}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-direct {v2, v1}, La/in0;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_0
    move-object/from16 v1, p1

    .line 94
    .line 95
    check-cast v1, Ljava/lang/Throwable;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v1, La/yk0;->b:La/yk0;

    .line 101
    .line 102
    sget-object v2, La/tn0;->a:La/tn0;

    .line 103
    .line 104
    invoke-virtual {v0, v1, v2}, La/qo0;->X(La/yk0;La/un0;)V

    .line 105
    .line 106
    .line 107
    sget-object v1, La/yk0;->c:La/yk0;

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2}, La/qo0;->X(La/yk0;La/un0;)V

    .line 110
    .line 111
    .line 112
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_1
    move-object/from16 v1, p1

    .line 116
    .line 117
    check-cast v1, La/pb0;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 123
    .line 124
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 125
    .line 126
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 134
    .line 135
    move-object v5, v3

    .line 136
    check-cast v5, La/ln0;

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v8, v1, La/pb0;->a:La/ql5;

    .line 142
    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    const v17, 0xfffb

    .line 146
    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v9, 0x0

    .line 151
    const/4 v10, 0x0

    .line 152
    const/4 v11, 0x0

    .line 153
    const/4 v12, 0x0

    .line 154
    const/4 v13, 0x0

    .line 155
    const-wide/16 v14, 0x0

    .line 156
    .line 157
    invoke-static/range {v5 .. v17}, La/ln0;->a(La/ln0;La/yk0;ZLa/ql5;Ljava/util/LinkedHashMap;Ljava/util/Set;Ljava/util/List;La/un0;La/un0;JZI)La/ln0;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_1

    .line 166
    .line 167
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
