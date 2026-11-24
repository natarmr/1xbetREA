.class public final La/njb0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/tjb0;

.field public m:I


# direct methods
.method public constructor <init>(La/tjb0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/njb0;->l:La/tjb0;

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
    .locals 6

    .line 1
    iput-object p1, p0, La/njb0;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/njb0;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/njb0;->m:I

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    iget-object v0, p0, La/njb0;->l:La/tjb0;

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, La/tjb0;->j(JJLa/zje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
