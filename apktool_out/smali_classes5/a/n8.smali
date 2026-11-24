.class public final synthetic La/n8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/pqv;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/pqv;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n8;->a:B

    iput-object p1, p0, La/n8;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/n8;->c:La/pqv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/n8;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/iu30;

    .line 7
    .line 8
    iget-object v1, p0, La/n8;->c:La/pqv;

    .line 9
    .line 10
    invoke-interface {v1}, La/pqv;->n()La/r040;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, La/iu30;-><init>(La/r040;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/n8;->b:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    new-instance v0, La/iu30;

    .line 26
    .line 27
    iget-object v1, p0, La/n8;->c:La/pqv;

    .line 28
    .line 29
    invoke-interface {v1}, La/pqv;->n()La/r040;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, La/iu30;-><init>(La/r040;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/n8;->b:Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
