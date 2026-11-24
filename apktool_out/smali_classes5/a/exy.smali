.class public final La/exy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l6w;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/l6w;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/exy;->a:B

    iput-object p1, p0, La/exy;->b:La/l6w;

    iput-object p2, p0, La/exy;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/exy;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/exy;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/exy;->b:La/l6w;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/h2l0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-boolean p1, p0, La/l6w;->d:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-wide p0, p0, La/l6w;->a:J

    .line 20
    .line 21
    new-instance v0, La/sb2;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/sb2;-><init>(J)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    check-cast p1, La/h2l0;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-boolean p1, p0, La/l6w;->d:Z

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-wide p0, p0, La/l6w;->a:J

    .line 42
    .line 43
    new-instance v0, La/sb2;

    .line 44
    .line 45
    invoke-direct {v0, p0, p1}, La/sb2;-><init>(J)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    check-cast p1, La/h2l0;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-boolean p1, p0, La/l6w;->d:Z

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    iget-wide p0, p0, La/l6w;->a:J

    .line 64
    .line 65
    new-instance v0, La/sb2;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, La/sb2;-><init>(J)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_2
    check-cast p1, La/h2l0;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-boolean p1, p0, La/l6w;->d:Z

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    iget-wide p0, p0, La/l6w;->a:J

    .line 86
    .line 87
    new-instance v0, La/sb2;

    .line 88
    .line 89
    invoke-direct {v0, p0, p1}, La/sb2;-><init>(J)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
