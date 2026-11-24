.class public Lio/noties/markwon/core/spans/LinkSpan;
.super Landroid/text/style/URLSpan;
.source "SourceFile"


# instance fields
.field public final a:La/b930;

.field public final b:Ljava/lang/String;

.field public final c:La/ub00;


# direct methods
.method public constructor <init>(La/b930;Ljava/lang/String;La/ub00;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/noties/markwon/core/spans/LinkSpan;->a:La/b930;

    .line 5
    .line 6
    iput-object p2, p0, Lio/noties/markwon/core/spans/LinkSpan;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lio/noties/markwon/core/spans/LinkSpan;->c:La/ub00;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/noties/markwon/core/spans/LinkSpan;->c:La/ub00;

    .line 2
    .line 3
    iget-object p0, p0, Lio/noties/markwon/core/spans/LinkSpan;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, p1, p0}, La/ub00;->d(Landroid/view/View;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/noties/markwon/core/spans/LinkSpan;->a:La/b930;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 8
    .line 9
    .line 10
    iget p0, p1, Landroid/text/TextPaint;->linkColor:I

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
