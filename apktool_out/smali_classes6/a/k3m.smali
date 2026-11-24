.class public final synthetic La/k3m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLa/ctf0;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/k3m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/k3m;->d:Ljava/lang/Object;

    iput p1, p0, La/k3m;->b:F

    iput-boolean p3, p0, La/k3m;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLa/i3m;F)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/k3m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/k3m;->c:Z

    iput-object p2, p0, La/k3m;->d:Ljava/lang/Object;

    iput p3, p0, La/k3m;->b:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/k3m;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/k3m;->c:Z

    .line 4
    .line 5
    iget v2, p0, La/k3m;->b:F

    .line 6
    .line 7
    iget-object p0, p0, La/k3m;->d:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/ctf0;

    .line 13
    .line 14
    move-object v3, p1

    .line 15
    check-cast v3, La/bnk0;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object p1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v4, "%.2f"

    .line 36
    .line 37
    invoke-static {p1, v4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-array v0, v2, [C

    .line 42
    .line 43
    const/16 v4, 0x30

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    aput-char v4, v0, v5

    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->w0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-array v0, v2, [C

    .line 53
    .line 54
    const/16 v4, 0x2e

    .line 55
    .line 56
    aput-char v4, v0, v5

    .line 57
    .line 58
    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->w0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v0, p0, La/ctf0;->b:La/lsm0;

    .line 67
    .line 68
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const v2, 0x7f130dbb

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    const p1, 0x7f07074f

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, La/ctf0;->d(I)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    :goto_0
    move v5, p0

    .line 89
    goto :goto_1

    .line 90
    :cond_0
    const p1, 0x7f07074b

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, La/ctf0;->d(I)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    goto :goto_0

    .line 98
    :goto_1
    if-eqz v1, :cond_1

    .line 99
    .line 100
    const p0, 0x7f0606bd

    .line 101
    .line 102
    .line 103
    :goto_2
    move v6, p0

    .line 104
    goto :goto_3

    .line 105
    :cond_1
    const p0, 0x7f0606e2

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_3
    const/4 v8, 0x0

    .line 110
    const/16 v9, 0x32

    .line 111
    .line 112
    const/4 v7, 0x0

    .line 113
    invoke-static/range {v3 .. v9}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_0
    check-cast p0, La/i3m;

    .line 120
    .line 121
    check-cast p1, La/j6z;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    if-eqz v1, :cond_2

    .line 127
    .line 128
    const-wide/16 v0, 0x0

    .line 129
    .line 130
    invoke-interface {p1, v0, v1}, La/j6z;->Y(J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    const-wide v3, 0xffffffffL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    and-long/2addr v0, v3

    .line 140
    long-to-int v0, v0

    .line 141
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-interface {p1}, La/j6z;->g()J

    .line 146
    .line 147
    .line 148
    move-result-wide v5

    .line 149
    and-long/2addr v3, v5

    .line 150
    long-to-int p1, v3

    .line 151
    int-to-float p1, p1

    .line 152
    add-float/2addr v0, p1

    .line 153
    iget-object p1, p0, La/i3m;->b:La/agk0;

    .line 154
    .line 155
    invoke-virtual {p1, v0}, La/agk0;->m(F)V

    .line 156
    .line 157
    .line 158
    iget-object p0, p0, La/i3m;->c:La/pz40;

    .line 159
    .line 160
    new-instance p1, La/ycl;

    .line 161
    .line 162
    invoke-direct {p1, v2}, La/ycl;-><init>(F)V

    .line 163
    .line 164
    .line 165
    check-cast p0, La/hgk0;

    .line 166
    .line 167
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
