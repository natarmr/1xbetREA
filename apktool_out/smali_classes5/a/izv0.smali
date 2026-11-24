.class public final synthetic La/izv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rzv0;


# direct methods
.method public synthetic constructor <init>(La/rzv0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/izv0;->a:B

    iput-object p1, p0, La/izv0;->b:La/rzv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/izv0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/izv0;->b:La/rzv0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of p1, p1, La/j7t0;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget-object p1, La/g9p;->a:La/g9p;

    .line 18
    .line 19
    :goto_0
    move-object v2, p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    sget-object p1, La/d9p;->a:La/d9p;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :goto_1
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 25
    .line 26
    iget-object v8, p1, La/ocj;->a:La/p7m0;

    .line 27
    .line 28
    :cond_1
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 36
    .line 37
    move-object v1, v0

    .line 38
    move-object v0, p1

    .line 39
    check-cast v0, La/bzv0;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/16 v7, 0x3d

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static/range {v0 .. v7}, La/bzv0;->a(La/bzv0;Ljava/lang/String;La/h9p;La/qdt;ZLjava/util/List;ZI)La/bzv0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v8, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 65
    .line 66
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 67
    .line 68
    check-cast p1, Ljava/lang/Throwable;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    instance-of p1, p1, La/sq60;

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    iget-object p1, p0, La/ocj;->a:La/p7m0;

    .line 78
    .line 79
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-object v1, p0

    .line 87
    check-cast v1, La/bzv0;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    const/16 v8, 0x3b

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    const/4 v3, 0x0

    .line 97
    sget-object v4, La/ndt;->a:La/ndt;

    .line 98
    .line 99
    const/4 v5, 0x0

    .line 100
    const/4 v6, 0x0

    .line 101
    invoke-static/range {v1 .. v8}, La/bzv0;->a(La/bzv0;Ljava/lang/String;La/h9p;La/qdt;ZLjava/util/List;ZI)La/bzv0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {p1, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_2

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 113
    .line 114
    :cond_4
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-object v1, p1

    .line 122
    check-cast v1, La/bzv0;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    const/4 v7, 0x0

    .line 128
    const/16 v8, 0x3b

    .line 129
    .line 130
    const/4 v2, 0x0

    .line 131
    const/4 v3, 0x0

    .line 132
    sget-object v4, La/fdt;->a:La/fdt;

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    const/4 v6, 0x0

    .line 136
    invoke-static/range {v1 .. v8}, La/bzv0;->a(La/bzv0;Ljava/lang/String;La/h9p;La/qdt;ZLjava/util/List;ZI)La/bzv0;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_4

    .line 145
    .line 146
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
