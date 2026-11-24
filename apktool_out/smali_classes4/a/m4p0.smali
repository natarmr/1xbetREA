.class public final synthetic La/m4p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q4p0;


# direct methods
.method public synthetic constructor <init>(La/q4p0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m4p0;->a:B

    iput-object p1, p0, La/m4p0;->b:La/q4p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/m4p0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/m4p0;->b:La/q4p0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Ljava/lang/Throwable;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 17
    .line 18
    iget-object v3, p1, La/ocj;->a:La/p7m0;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    move-object v5, p1

    .line 30
    check-cast v5, La/h4p0;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v4, La/iun;->a:La/iun;

    .line 36
    .line 37
    const/16 v6, 0x10

    .line 38
    .line 39
    invoke-static {v5, v2, v1, v4, v6}, La/h4p0;->a(La/h4p0;ZZLjava/util/List;I)La/h4p0;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v3, p1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iget-object v0, p0, La/q4p0;->u:La/m1e;

    .line 62
    .line 63
    invoke-interface {v0}, La/m1e;->c()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    new-instance v0, La/i4p0;

    .line 70
    .line 71
    iget-object v1, p0, La/q4p0;->o:La/ctf0;

    .line 72
    .line 73
    new-array v3, v2, [Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 76
    .line 77
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, p1, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-direct {v0, p1}, La/i4p0;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 93
    .line 94
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 95
    .line 96
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 104
    .line 105
    move-object v4, v0

    .line 106
    check-cast v4, La/h4p0;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    const/16 v5, 0x19

    .line 113
    .line 114
    invoke-static {v4, v2, v1, v3, v5}, La/h4p0;->a(La/h4p0;ZZLjava/util/List;I)La/h4p0;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {p1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_2

    .line 123
    .line 124
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
