.class public final synthetic La/kas;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kas;->a:B

    iput-object p1, p0, La/kas;->b:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kas;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/kas;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/ub4;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ub4;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/das;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p0, La/a21;

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, La/a21;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/das;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    check-cast p0, La/jar;

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, La/jar;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, La/das;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_2
    check-cast p0, La/jv1;

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, La/jv1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, La/das;

    .line 42
    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
