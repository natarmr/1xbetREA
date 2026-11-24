.class public final La/n8l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:La/p8l;

.field public final synthetic b:J

.field public final synthetic c:La/vne;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(La/p8l;JLa/vne;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/n8l;->a:La/p8l;

    .line 5
    .line 6
    iput-wide p2, p0, La/n8l;->b:J

    .line 7
    .line 8
    iput-object p4, p0, La/n8l;->c:La/vne;

    .line 9
    .line 10
    iput-boolean p5, p0, La/n8l;->d:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/n8l;->a:La/p8l;

    .line 8
    .line 9
    invoke-virtual {p1}, La/p8l;->j()La/j8l;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object p3, p1, La/p8l;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p3, La/p7l;

    .line 16
    .line 17
    invoke-virtual {p3}, La/p7l;->e()I

    .line 18
    .line 19
    .line 20
    move-result p7

    .line 21
    invoke-virtual {p3}, La/p7l;->f()F

    .line 22
    .line 23
    .line 24
    move-result p8

    .line 25
    new-instance p9, La/v9k;

    .line 26
    .line 27
    const/16 p3, 0x1c

    .line 28
    .line 29
    invoke-direct {p9, p1, p3}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    const p3, 0x7f080498

    .line 33
    .line 34
    .line 35
    iget-wide p4, p0, La/n8l;->b:J

    .line 36
    .line 37
    iget-object p6, p0, La/n8l;->c:La/vne;

    .line 38
    .line 39
    invoke-virtual/range {p2 .. p9}, La/j8l;->k(IJLa/vne;IFLkotlin/jvm/functions/Function0;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, La/p8l;->j()La/j8l;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    iget-boolean p0, p0, La/n8l;->d:Z

    .line 47
    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    const/4 p3, 0x0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/16 p3, 0x8

    .line 53
    .line 54
    :goto_0
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, La/p8l;->m:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, La/l8l;

    .line 60
    .line 61
    iput-boolean p0, p1, La/l8l;->i:Z

    .line 62
    .line 63
    return-void
.end method
