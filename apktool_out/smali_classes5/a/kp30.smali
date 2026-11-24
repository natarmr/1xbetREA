.class public final synthetic La/kp30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mkw;


# direct methods
.method public synthetic constructor <init>(La/mkw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kp30;->a:B

    iput-object p1, p0, La/kp30;->b:La/mkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/kp30;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/kp30;->b:La/mkw;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p0, p0, La/mkw;->b:La/ctf0;

    .line 19
    .line 20
    invoke-static {p0}, La/x9x;->E(La/ctf0;)La/xw00;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    return-object v1

    .line 25
    :pswitch_0
    check-cast p1, La/nx4;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p1, La/nx4;->a:La/gx4;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, La/mkw;->b:La/ctf0;

    .line 35
    .line 36
    iget-object v1, v0, La/gx4;->e:La/mnb0;

    .line 37
    .line 38
    iget-object v2, p1, La/nx4;->b:Ljava/lang/String;

    .line 39
    .line 40
    iget-boolean p1, p1, La/nx4;->c:Z

    .line 41
    .line 42
    invoke-static {v0, p0, v1, v2, p1}, La/aad;->e0(La/gx4;La/ctf0;La/mnb0;Ljava/lang/String;Z)La/qx4;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_1
    return-object v1

    .line 47
    :pswitch_1
    check-cast p1, La/x6c0;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p1, La/x6c0;->a:La/czc0;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    iget-object p0, p0, La/mkw;->b:La/ctf0;

    .line 57
    .line 58
    iget-boolean p1, p1, La/x6c0;->b:Z

    .line 59
    .line 60
    invoke-static {v0, p0, p1}, La/x9x;->a0(La/czc0;La/ctf0;Z)La/a7c0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :cond_2
    return-object v1

    .line 65
    :pswitch_2
    check-cast p1, La/xvj0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v0, p1, La/xvj0;->a:La/rvj0;

    .line 71
    .line 72
    iget-object v1, p1, La/xvj0;->b:Ljava/lang/String;

    .line 73
    .line 74
    iget-object p0, p0, La/mkw;->b:La/ctf0;

    .line 75
    .line 76
    iget-boolean p1, p1, La/xvj0;->c:Z

    .line 77
    .line 78
    invoke-static {v0, v1, p0, p1}, La/t9x;->S(La/rvj0;Ljava/lang/String;La/ctf0;Z)La/awj0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_3
    check-cast p1, La/cf6;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v0, p1, La/cf6;->a:La/an5;

    .line 89
    .line 90
    iget-object v1, p0, La/mkw;->b:La/ctf0;

    .line 91
    .line 92
    iget-wide v2, p1, La/cf6;->b:D

    .line 93
    .line 94
    iget-object v4, p1, La/cf6;->c:La/fo7;

    .line 95
    .line 96
    iget-boolean v5, p1, La/cf6;->d:Z

    .line 97
    .line 98
    invoke-static/range {v0 .. v5}, La/j2e;->V(La/an5;La/ctf0;DLa/fo7;Z)La/ff6;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_4
    check-cast p1, La/ly6;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v0, La/q820;

    .line 109
    .line 110
    iget-object p0, p0, La/mkw;->b:La/ctf0;

    .line 111
    .line 112
    invoke-static {p1, p0}, La/y0x0;->M(La/ly6;La/ctf0;)La/xy6;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-direct {v0, p0}, La/q820;-><init>(La/xy6;)V

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
