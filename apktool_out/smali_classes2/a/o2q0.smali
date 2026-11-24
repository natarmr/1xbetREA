.class public final La/o2q0;
.super La/zsm0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:La/zsm0;

.field public final synthetic d:La/p2q0;


# direct methods
.method public constructor <init>(La/p2q0;Landroid/content/Context;Landroid/text/TextPaint;La/zsm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/o2q0;->d:La/p2q0;

    .line 5
    .line 6
    iput-object p2, p0, La/o2q0;->a:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, La/o2q0;->b:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput-object p4, p0, La/o2q0;->c:La/zsm0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final t(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/o2q0;->c:La/zsm0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/zsm0;->t(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, La/o2q0;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, La/o2q0;->b:Landroid/text/TextPaint;

    .line 4
    .line 5
    iget-object v2, p0, La/o2q0;->d:La/p2q0;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1, p1}, La/p2q0;->f(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/o2q0;->c:La/zsm0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, La/zsm0;->u(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
