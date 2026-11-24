.class public final synthetic La/wcj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wcj;->a:B

    iput-object p1, p0, La/wcj;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wcj;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wcj;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    iget p0, p0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->c:I

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
