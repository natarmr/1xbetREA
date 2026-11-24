.class public final La/o8l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:La/p8l;

.field public final synthetic b:J

.field public final synthetic c:La/vne;


# direct methods
.method public constructor <init>(La/p8l;JLa/vne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/o8l;->a:La/p8l;

    .line 5
    .line 6
    iput-wide p2, p0, La/o8l;->b:J

    .line 7
    .line 8
    iput-object p4, p0, La/o8l;->c:La/vne;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/o8l;->a:La/p8l;

    .line 8
    .line 9
    invoke-virtual {p1}, La/p8l;->n()La/j8l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p2, p1, La/p8l;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, La/p7l;

    .line 16
    .line 17
    invoke-virtual {p2}, La/p7l;->e()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-virtual {p2}, La/p7l;->f()F

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x0

    .line 26
    const/16 v8, 0x20

    .line 27
    .line 28
    const v1, 0x7f0804b8

    .line 29
    .line 30
    .line 31
    iget-wide v2, p0, La/o8l;->b:J

    .line 32
    .line 33
    iget-object v4, p0, La/o8l;->c:La/vne;

    .line 34
    .line 35
    invoke-static/range {v0 .. v8}, La/j8l;->l(La/j8l;IJLa/vne;IFLa/ucj;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, La/p8l;->n()La/j8l;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/16 p2, 0x8

    .line 43
    .line 44
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p1, La/p8l;->m:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, La/l8l;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    return-void
.end method
