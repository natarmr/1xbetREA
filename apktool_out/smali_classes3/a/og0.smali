.class public final synthetic La/og0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ctf0;

.field public final synthetic c:La/pru;


# direct methods
.method public synthetic constructor <init>(BLa/pru;La/ctf0;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/og0;->a:B

    iput-object p3, p0, La/og0;->b:La/ctf0;

    iput-object p2, p0, La/og0;->c:La/pru;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/og0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/og0;->c:La/pru;

    .line 4
    .line 5
    iget-object p0, p0, La/og0;->b:La/ctf0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/njs;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/rjs;

    .line 16
    .line 17
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 22
    .line 23
    iget-object v1, v1, La/mum0;->x:La/zvh0;

    .line 24
    .line 25
    invoke-direct {v0, p1, p0, v1}, La/rjs;-><init>(La/njs;La/ctf0;La/zvh0;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    check-cast p1, La/r7s;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v0, La/a8s;

    .line 35
    .line 36
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 41
    .line 42
    iget-object v1, v1, La/mum0;->x:La/zvh0;

    .line 43
    .line 44
    invoke-direct {v0, p1, p0, v1}, La/a8s;-><init>(La/r7s;La/ctf0;La/zvh0;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_1
    check-cast p1, La/z2s;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v0, La/wnr;

    .line 54
    .line 55
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 60
    .line 61
    iget-object v1, v1, La/mum0;->x:La/zvh0;

    .line 62
    .line 63
    invoke-direct {v0, p1, p0, v1}, La/wnr;-><init>(La/z2s;La/ctf0;La/zvh0;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_2
    check-cast p1, La/c820;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v0, p1, La/c820;->l:La/ua20;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const/4 v2, 0x2

    .line 79
    if-eq v0, v2, :cond_1

    .line 80
    .line 81
    const/4 v2, 0x3

    .line 82
    if-eq v0, v2, :cond_0

    .line 83
    .line 84
    new-instance v0, La/fp30;

    .line 85
    .line 86
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 91
    .line 92
    iget-object v1, v1, La/mum0;->x:La/zvh0;

    .line 93
    .line 94
    invoke-direct {v0, p1, p0, v1}, La/fp30;-><init>(La/c820;La/ctf0;La/zvh0;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    new-instance v0, La/z19;

    .line 99
    .line 100
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 105
    .line 106
    iget-object v1, v1, La/mum0;->x:La/zvh0;

    .line 107
    .line 108
    invoke-direct {v0, p1, p0, v1}, La/z19;-><init>(La/c820;La/ctf0;La/zvh0;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    new-instance v0, La/eh00;

    .line 113
    .line 114
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 119
    .line 120
    iget-object v1, v1, La/mum0;->x:La/zvh0;

    .line 121
    .line 122
    invoke-direct {v0, p1, p0, v1}, La/eh00;-><init>(La/c820;La/ctf0;La/zvh0;)V

    .line 123
    .line 124
    .line 125
    :goto_0
    return-object v0

    .line 126
    :pswitch_3
    check-cast p1, La/hg0;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance v0, La/jg0;

    .line 132
    .line 133
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-direct {v0, p1, p0, v1}, La/jg0;-><init>(La/hg0;La/ctf0;La/sff0;)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
