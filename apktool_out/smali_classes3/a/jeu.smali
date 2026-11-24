.class public final La/jeu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:La/c7v;

.field public l:Ljava/util/List;

.field public m:Ljava/util/Collection;

.field public n:Ljava/lang/Object;

.field public o:Ljava/util/Iterator;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public s:Ljava/util/Collection;

.field public t:D

.field public u:I

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:La/abu;

.field public y:I


# direct methods
.method public constructor <init>(La/abu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jeu;->x:La/abu;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/zje;-><init>(La/yje;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, La/jeu;->w:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/jeu;->y:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/jeu;->y:I

    .line 9
    .line 10
    iget-object p1, p0, La/jeu;->x:La/abu;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, La/abu;->t(JLa/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
