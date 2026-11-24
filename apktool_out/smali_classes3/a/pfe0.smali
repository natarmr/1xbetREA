.class public final synthetic La/pfe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wfe0;


# direct methods
.method public synthetic constructor <init>(La/wfe0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pfe0;->a:B

    iput-object p1, p0, La/pfe0;->b:La/wfe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/pfe0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/pfe0;->b:La/wfe0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, La/pb0;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 15
    .line 16
    iget-object v1, p1, La/ocj;->a:La/p7m0;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 26
    .line 27
    move-object v3, p1

    .line 28
    check-cast v3, La/nfe0;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v7, v0, La/pb0;->a:La/ql5;

    .line 34
    .line 35
    const/16 v8, 0xff

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-static/range {v3 .. v8}, La/nfe0;->a(La/nfe0;La/aie;ZLjava/util/Set;La/ql5;I)La/nfe0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    instance-of v0, p1, La/jfp;

    .line 59
    .line 60
    iget-object v1, p0, La/wfe0;->r:La/ctf0;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    new-instance p1, La/lfe0;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    new-array v2, v0, [Ljava/lang/Object;

    .line 68
    .line 69
    iget-object v3, v1, La/ctf0;->b:La/lsm0;

    .line 70
    .line 71
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const v4, 0x7f1307bb

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-array v3, v0, [Ljava/lang/Object;

    .line 83
    .line 84
    iget-object v4, v1, La/ctf0;->b:La/lsm0;

    .line 85
    .line 86
    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const v5, 0x7f1303d7

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    new-array v4, v0, [Ljava/lang/Object;

    .line 98
    .line 99
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 100
    .line 101
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const v4, 0x7f130e5d

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v4, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-direct {p1, v2, v3, v0}, La/lfe0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    new-instance v0, La/kfe0;

    .line 120
    .line 121
    invoke-static {p1, v1}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {v0, p1}, La/kfe0;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
