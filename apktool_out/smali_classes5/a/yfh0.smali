.class public final La/yfh0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/lang/String;

.field public j:La/hl1;

.field public k:La/ouu;

.field public l:B

.field public m:I

.field public n:Z

.field public o:Z

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/ouu;

.field public r:I


# direct methods
.method public constructor <init>(La/ouu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/yfh0;->q:La/ouu;

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
    iput-object p1, p0, La/yfh0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/yfh0;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/yfh0;->r:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/yfh0;->q:La/ouu;

    .line 13
    .line 14
    invoke-virtual {v1, v0, p0, p1, v0}, La/ouu;->B(ILa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
