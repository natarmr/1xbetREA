.class public final La/wlr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ylr0;

.field public final synthetic c:La/hmr0;


# direct methods
.method public synthetic constructor <init>(La/ylr0;La/hmr0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wlr0;->a:B

    iput-object p1, p0, La/wlr0;->b:La/ylr0;

    iput-object p2, p0, La/wlr0;->c:La/hmr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wlr0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/wlr0;->c:La/hmr0;

    .line 4
    .line 5
    iget-object p0, p0, La/wlr0;->b:La/ylr0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget v0, v1, La/hmr0;->a:I

    .line 11
    .line 12
    sget v1, La/ylr0;->m2:I

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/ylr0;->P0(I)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    iget v0, v1, La/hmr0;->a:I

    .line 21
    .line 22
    sget v1, La/ylr0;->m2:I

    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/ylr0;->P0(I)V

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
