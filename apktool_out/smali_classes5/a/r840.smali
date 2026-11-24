.class public final La/r840;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/i740;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/i740;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r840;->a:B

    iput-object p1, p0, La/r840;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/r840;->c:La/i740;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r840;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/r840;->c:La/i740;

    .line 4
    .line 5
    iget-object p0, p0, La/r840;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/r740;

    .line 11
    .line 12
    iget-object v1, v1, La/i740;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/r740;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    new-instance v0, La/t740;

    .line 24
    .line 25
    invoke-direct {v0, v1}, La/t740;-><init>(La/i740;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
