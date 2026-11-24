.class public final synthetic La/s7x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:La/a4x;

.field public final synthetic d:La/ugd;


# direct methods
.method public synthetic constructor <init>(BILa/ugd;La/a4x;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/s7x;->a:B

    iput p2, p0, La/s7x;->b:I

    iput-object p4, p0, La/s7x;->c:La/a4x;

    iput-object p3, p0, La/s7x;->d:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/s7x;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/s7x;->d:La/ugd;

    .line 5
    .line 6
    iget-object v3, p0, La/s7x;->c:La/a4x;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/hcz;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, La/oea;

    .line 17
    .line 18
    const/16 v4, 0x12

    .line 19
    .line 20
    invoke-direct {v0, v3, v4}, La/oea;-><init>(La/a4x;B)V

    .line 21
    .line 22
    .line 23
    new-instance v4, La/oea;

    .line 24
    .line 25
    const/16 v5, 0x13

    .line 26
    .line 27
    invoke-direct {v4, v3, v5}, La/oea;-><init>(La/a4x;B)V

    .line 28
    .line 29
    .line 30
    new-instance v5, La/fpg;

    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    invoke-direct {v5, v2, v3, v6}, La/fpg;-><init>(La/ugd;La/a4x;B)V

    .line 34
    .line 35
    .line 36
    new-instance v2, La/ugd;

    .line 37
    .line 38
    const v3, 0x733a3e4

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, v3, v1, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget p0, p0, La/s7x;->b:I

    .line 45
    .line 46
    invoke-virtual {p1, p0, v0, v4, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    move-object v0, p1

    .line 53
    check-cast v0, La/i8z;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-object p1, v2

    .line 59
    new-instance v2, La/oea;

    .line 60
    .line 61
    const/16 v4, 0x10

    .line 62
    .line 63
    invoke-direct {v2, v3, v4}, La/oea;-><init>(La/a4x;B)V

    .line 64
    .line 65
    .line 66
    move-object v4, v3

    .line 67
    new-instance v3, La/oea;

    .line 68
    .line 69
    const/16 v5, 0x11

    .line 70
    .line 71
    invoke-direct {v3, v4, v5}, La/oea;-><init>(La/a4x;B)V

    .line 72
    .line 73
    .line 74
    new-instance v5, La/fpg;

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    invoke-direct {v5, p1, v4, v6}, La/fpg;-><init>(La/ugd;La/a4x;B)V

    .line 78
    .line 79
    .line 80
    new-instance v4, La/ugd;

    .line 81
    .line 82
    const p1, 0x7ce1bae8

    .line 83
    .line 84
    .line 85
    invoke-direct {v4, p1, v1, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    const/4 v5, 0x4

    .line 89
    iget v1, p0, La/s7x;->b:I

    .line 90
    .line 91
    invoke-static/range {v0 .. v5}, La/i8z;->f(La/i8z;ILa/oea;La/oea;La/ugd;I)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
