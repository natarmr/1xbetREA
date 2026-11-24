.class public final synthetic La/rrf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/srf0;

.field public final synthetic c:La/mrf0;


# direct methods
.method public synthetic constructor <init>(La/srf0;La/mrf0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rrf0;->a:B

    iput-object p1, p0, La/rrf0;->b:La/srf0;

    iput-object p2, p0, La/rrf0;->c:La/mrf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rrf0;->a:B

    iget-object v1, p0, La/rrf0;->c:La/mrf0;

    iget-object p0, p0, La/rrf0;->b:La/srf0;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, v1}, La/srf0;->d(La/srf0;La/mrf0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_0
    invoke-static {p0, v1}, La/srf0;->c(La/srf0;La/mrf0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_1
    invoke-static {p0, v1}, La/srf0;->b(La/srf0;La/mrf0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
