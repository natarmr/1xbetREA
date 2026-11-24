.class public final synthetic La/mp30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/op30;


# direct methods
.method public synthetic constructor <init>(La/op30;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mp30;->a:B

    iput-object p1, p0, La/mp30;->b:La/op30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/mp30;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/mp30;->b:La/op30;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p0, p0, La/op30;->b:La/ctf0;

    .line 19
    .line 20
    new-instance p1, La/xw00;

    .line 21
    .line 22
    invoke-static {p0}, La/kcx;->C(La/ctf0;)La/wul;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {p1, v0, v0, p0}, La/xw00;-><init>(La/f9x;La/wul;La/wul;)V

    .line 27
    .line 28
    .line 29
    move-object v0, p1

    .line 30
    :goto_0
    return-object v0

    .line 31
    :pswitch_0
    check-cast p1, La/kx4;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v0, p1, La/kx4;->a:La/hx4;

    .line 37
    .line 38
    iget-object p0, p0, La/op30;->b:La/ctf0;

    .line 39
    .line 40
    iget-boolean p1, p1, La/kx4;->b:Z

    .line 41
    .line 42
    invoke-static {v0, p0, p1}, La/wb;->N(La/hx4;La/ctf0;Z)La/qx4;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_1
    check-cast p1, La/u6c0;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p1, La/u6c0;->a:La/dzc0;

    .line 53
    .line 54
    iget-object p0, p0, La/op30;->b:La/ctf0;

    .line 55
    .line 56
    iget-boolean p1, p1, La/u6c0;->b:Z

    .line 57
    .line 58
    invoke-static {v0, p0, p1}, La/k9x;->T(La/dzc0;La/ctf0;Z)La/a7c0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, La/uvj0;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v0, p1, La/uvj0;->a:La/pvj0;

    .line 69
    .line 70
    iget-object p0, p0, La/op30;->b:La/ctf0;

    .line 71
    .line 72
    iget-boolean v1, p1, La/uvj0;->c:Z

    .line 73
    .line 74
    iget-object p1, p1, La/uvj0;->b:La/q4f;

    .line 75
    .line 76
    invoke-static {v0, p0, v1, p1}, La/e9x;->b0(La/pvj0;La/ctf0;ZLa/q4f;)La/awj0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_3
    check-cast p1, La/ze6;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v0, p1, La/ze6;->a:La/xm5;

    .line 87
    .line 88
    iget-object v1, p0, La/op30;->b:La/ctf0;

    .line 89
    .line 90
    iget-wide v2, p1, La/ze6;->b:D

    .line 91
    .line 92
    iget-object v4, p1, La/ze6;->c:La/ko7;

    .line 93
    .line 94
    iget-boolean v5, p1, La/ze6;->d:Z

    .line 95
    .line 96
    invoke-static/range {v0 .. v5}, La/q8a;->u0(La/xm5;La/ctf0;DLa/ko7;Z)La/ff6;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_4
    check-cast p1, La/nhp;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v0, La/n820;

    .line 107
    .line 108
    iget-object v1, p1, La/nhp;->a:La/txe;

    .line 109
    .line 110
    iget-object p0, p0, La/op30;->b:La/ctf0;

    .line 111
    .line 112
    iget-boolean v2, p1, La/nhp;->b:Z

    .line 113
    .line 114
    iget-boolean p1, p1, La/nhp;->c:Z

    .line 115
    .line 116
    invoke-static {v1, p0, v2, p1}, La/kcx;->R(La/txe;La/ctf0;ZZ)La/dye;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-direct {v0, p0}, La/n820;-><init>(La/dye;)V

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
