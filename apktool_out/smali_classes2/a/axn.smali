.class public final synthetic La/axn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n9c;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cxn;


# direct methods
.method public synthetic constructor <init>(La/cxn;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/axn;->a:B

    iput-object p1, p0, La/axn;->b:La/cxn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/axn;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/axn;->b:La/cxn;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/cxn;->g:Lcom/google/android/material/internal/CheckableImageButton;

    .line 9
    .line 10
    iget-object p0, p0, La/cxn;->o:Landroid/view/View$OnLongClickListener;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0, p0, v1}, La/cww;->S(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, La/cxn;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 21
    .line 22
    iget-object p0, p0, La/cxn;->f:Landroid/view/View$OnLongClickListener;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, p0, v1}, La/cww;->S(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
