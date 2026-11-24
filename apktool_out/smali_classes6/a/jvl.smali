.class public final La/jvl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

.field public final synthetic b:La/gbe0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Integer;

.field public final synthetic f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jvl;->a:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 5
    .line 6
    iput-object p2, p0, La/jvl;->b:La/gbe0;

    .line 7
    .line 8
    iput-object p3, p0, La/jvl;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput p4, p0, La/jvl;->d:I

    .line 11
    .line 12
    iput-object p5, p0, La/jvl;->e:Ljava/lang/Integer;

    .line 13
    .line 14
    iput-object p6, p0, La/jvl;->f:Ljava/lang/Integer;

    .line 15
    .line 16
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
    iget-object p4, p0, La/jvl;->e:Ljava/lang/Integer;

    .line 8
    .line 9
    iget-object p5, p0, La/jvl;->f:Ljava/lang/Integer;

    .line 10
    .line 11
    move-object p1, p0

    .line 12
    iget-object p0, p1, La/jvl;->a:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 13
    .line 14
    move-object p2, p1

    .line 15
    iget-object p1, p2, La/jvl;->b:La/gbe0;

    .line 16
    .line 17
    move-object p3, p2

    .line 18
    iget-object p2, p3, La/jvl;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget p3, p3, La/jvl;->d:I

    .line 21
    .line 22
    invoke-static/range {p0 .. p5}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
