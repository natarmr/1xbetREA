.class public final La/q9q0;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/z6e;

.field public final synthetic b:La/uhg0;


# direct methods
.method public constructor <init>(La/z6e;La/uhg0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/q9q0;->a:La/z6e;

    .line 2
    .line 3
    iput-object p2, p0, La/q9q0;->b:La/uhg0;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/q9q0;->a:La/z6e;

    .line 5
    .line 6
    iget-object p0, p0, La/q9q0;->b:La/uhg0;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
