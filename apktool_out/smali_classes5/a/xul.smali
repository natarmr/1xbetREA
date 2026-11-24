.class public final synthetic La/xul;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/cvl;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/cvl;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xul;->a:B

    iput-object p1, p0, La/xul;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/xul;->c:La/cvl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/xul;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/xul;->c:La/cvl;

    .line 4
    .line 5
    iget-object p0, p0, La/xul;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/rya0;

    .line 11
    .line 12
    iget v1, v1, La/cvl;->a:I

    .line 13
    .line 14
    int-to-long v1, v1

    .line 15
    invoke-direct {v0, v1, v2}, La/rya0;-><init>(J)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
