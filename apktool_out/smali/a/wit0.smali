.class public final La/wit0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/q4f;

.field public j:Ljava/util/List;

.field public k:Ljava/util/ArrayList;

.field public l:Ljava/util/ArrayList;

.field public m:La/oif0;

.field public n:Z

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/vit0;

.field public q:I


# direct methods
.method public constructor <init>(La/vit0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wit0;->p:La/vit0;

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
    iput-object p1, p0, La/wit0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/wit0;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/wit0;->q:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/wit0;->p:La/vit0;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, La/vit0;->b(La/q4f;ZLa/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
