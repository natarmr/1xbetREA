.class public final La/jah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;

.field public final synthetic b:La/hah;

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;La/hah;Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jah;->a:Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;

    .line 5
    .line 6
    iput-object p2, p0, La/jah;->b:La/hah;

    .line 7
    .line 8
    iput-object p3, p0, La/jah;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    iput-boolean p4, p0, La/jah;->d:Z

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
    sget p1, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->o:I

    .line 8
    .line 9
    iget-object p1, p0, La/jah;->a:Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;

    .line 10
    .line 11
    iget-object p2, p0, La/jah;->b:La/hah;

    .line 12
    .line 13
    iget-object p3, p0, La/jah;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-boolean p0, p0, La/jah;->d:Z

    .line 16
    .line 17
    invoke-virtual {p1, p2, p3, p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->b(La/hah;Ljava/util/ArrayList;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
