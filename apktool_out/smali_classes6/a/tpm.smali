.class public final synthetic La/tpm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/uikit/components/search_field/DsSearchField;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit/components/search_field/DsSearchField;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tpm;->a:B

    iput-object p1, p0, La/tpm;->b:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/tpm;->a:B

    iget-object p0, p0, La/tpm;->b:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    packed-switch p1, :pswitch_data_0

    invoke-static {p0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->e(Lorg/xplatform/uikit/components/search_field/DsSearchField;)V

    return-void

    :pswitch_0
    invoke-static {p0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->d(Lorg/xplatform/uikit/components/search_field/DsSearchField;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
