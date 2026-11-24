.class public final synthetic La/sq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vq;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/vq;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sq;->a:B

    iput-object p1, p0, La/sq;->b:La/vq;

    iput-object p2, p0, La/sq;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/sq;->c:Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    iget-object p0, p0, La/sq;->b:La/vq;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, La/vq;->h(Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    invoke-virtual {p0, v1}, La/vq;->h(Lkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_1
    invoke-virtual {p0, v1}, La/vq;->h(Lkotlin/jvm/functions/Function0;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_2
    invoke-virtual {p0, v1}, La/vq;->h(Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_3
    invoke-virtual {p0, v1}, La/vq;->h(Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
