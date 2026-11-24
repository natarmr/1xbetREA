.class public final synthetic La/rdk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/djz;La/cqq;ZZLa/k7q0;La/qe60;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/rdk0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rdk0;->d:Ljava/lang/Object;

    iput-object p2, p0, La/rdk0;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/rdk0;->b:Z

    iput-boolean p4, p0, La/rdk0;->c:Z

    iput-object p5, p0, La/rdk0;->f:Ljava/lang/Object;

    iput-object p6, p0, La/rdk0;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/wdk0;La/xdk0;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/rdk0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rdk0;->d:Ljava/lang/Object;

    iput-object p2, p0, La/rdk0;->e:Ljava/lang/Object;

    iput-object p3, p0, La/rdk0;->f:Ljava/lang/Object;

    iput-boolean p4, p0, La/rdk0;->b:Z

    iput-boolean p5, p0, La/rdk0;->c:Z

    iput-object p6, p0, La/rdk0;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/rdk0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/rdk0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/rdk0;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/rdk0;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/rdk0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, La/djz;

    .line 15
    .line 16
    check-cast v3, La/cqq;

    .line 17
    .line 18
    check-cast v2, La/k7q0;

    .line 19
    .line 20
    check-cast v1, La/qe60;

    .line 21
    .line 22
    check-cast p1, La/ne60;

    .line 23
    .line 24
    invoke-virtual {v4}, La/djz;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-static {v3}, La/cqq;->a(La/cqq;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-boolean v0, p0, La/rdk0;->b:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget-object v0, v4, La/djz;->c:La/pkk0;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    check-cast v0, La/r3k;

    .line 43
    .line 44
    invoke-virtual {v0}, La/r3k;->b()V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    invoke-virtual {v4}, La/djz;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-boolean p0, p0, La/rdk0;->c:Z

    .line 54
    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    invoke-virtual {v4}, La/djz;->a()La/dmv;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    sget-object v0, La/dmv;->b:La/dmv;

    .line 62
    .line 63
    if-eq p0, v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {v4}, La/djz;->d()La/b9q0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    iget-wide v2, p1, La/ne60;->a:J

    .line 72
    .line 73
    iget-object p1, v4, La/djz;->d:La/hsj;

    .line 74
    .line 75
    iget-object v0, v4, La/djz;->v:La/ome;

    .line 76
    .line 77
    const/4 v5, 0x1

    .line 78
    invoke-virtual {p0, v5, v2, v3}, La/b9q0;->b(ZJ)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-interface {v1, p0}, La/qe60;->n(I)I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    iget-object p1, p1, La/hsj;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, La/a8q0;

    .line 89
    .line 90
    invoke-static {p0, p0}, La/s7n0;->e(II)J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    const/4 p0, 0x5

    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-static {p1, v3, v1, v2, p0}, La/a8q0;->a(La/a8q0;La/j83;JI)La/a8q0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v0, p0}, La/ome;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    iget-object p0, v4, La/djz;->a:La/hhk;

    .line 104
    .line 105
    iget-object p0, p0, La/hhk;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, La/j83;

    .line 108
    .line 109
    iget-object p0, p0, La/j83;->b:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-lez p0, :cond_3

    .line 116
    .line 117
    sget-object p0, La/dmv;->c:La/dmv;

    .line 118
    .line 119
    iget-object p1, v4, La/djz;->k:La/pz40;

    .line 120
    .line 121
    check-cast p1, La/hgk0;

    .line 122
    .line 123
    invoke-virtual {p1, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    invoke-virtual {v2, p1}, La/k7q0;->d(La/ne60;)V

    .line 128
    .line 129
    .line 130
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_0
    move-object v0, v4

    .line 134
    check-cast v0, La/wdk0;

    .line 135
    .line 136
    check-cast v3, La/xdk0;

    .line 137
    .line 138
    move-object v4, v2

    .line 139
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 140
    .line 141
    move-object v7, v1

    .line 142
    check-cast v7, Ljava/lang/Integer;

    .line 143
    .line 144
    move-object v2, p1

    .line 145
    check-cast v2, La/kxq;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-object v1, v3

    .line 151
    const/4 v3, 0x0

    .line 152
    const/4 v8, 0x4

    .line 153
    iget-boolean v5, p0, La/rdk0;->b:Z

    .line 154
    .line 155
    iget-boolean v6, p0, La/rdk0;->c:Z

    .line 156
    .line 157
    invoke-static/range {v0 .. v8}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
