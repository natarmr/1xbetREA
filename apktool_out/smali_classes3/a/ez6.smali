.class public final synthetic La/ez6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hz6;

.field public final synthetic c:La/k390;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(La/hz6;La/k390;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ez6;->a:B

    iput-object p1, p0, La/ez6;->b:La/hz6;

    iput-object p2, p0, La/ez6;->c:La/k390;

    iput p3, p0, La/ez6;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/ez6;->a:B

    .line 2
    .line 3
    iget v1, p0, La/ez6;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/ez6;->c:La/k390;

    .line 6
    .line 7
    iget-object p0, p0, La/ez6;->b:La/hz6;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/hz6;->p2:La/cl5;

    .line 13
    .line 14
    invoke-virtual {p0, v2, v1}, La/hz6;->V0(La/k390;I)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    sget-object v0, La/hz6;->p2:La/cl5;

    .line 21
    .line 22
    invoke-virtual {p0, v2, v1}, La/hz6;->V0(La/k390;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
