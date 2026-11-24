.class public final La/n57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/qgv0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/qgv0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n57;->a:B

    iput-object p1, p0, La/n57;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/n57;->c:La/qgv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/n57;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/n57;->c:La/qgv0;

    .line 4
    .line 5
    iget-object p0, p0, La/n57;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, La/qgv0;->f:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v1, La/i37;

    .line 13
    .line 14
    invoke-direct {v1, v0}, La/i37;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iget-object v0, v1, La/qgv0;->f:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, La/i37;

    .line 26
    .line 27
    invoke-direct {v1, v0}, La/i37;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    iget-object v0, v1, La/qgv0;->f:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v1, La/i37;

    .line 39
    .line 40
    invoke-direct {v1, v0}, La/i37;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_2
    iget-object v0, v1, La/qgv0;->f:Ljava/lang/String;

    .line 50
    .line 51
    new-instance v1, La/i37;

    .line 52
    .line 53
    invoke-direct {v1, v0}, La/i37;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
