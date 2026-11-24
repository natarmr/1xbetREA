.class public final La/azk0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/lme0;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/bzk0;

.field public l:I


# direct methods
.method public constructor <init>(La/bzk0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/azk0;->k:La/bzk0;

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
    .locals 8

    .line 1
    iput-object p1, p0, La/azk0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/azk0;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/azk0;->l:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, p0, La/azk0;->k:La/bzk0;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    move-object v7, p0

    .line 19
    invoke-virtual/range {v0 .. v7}, La/bzk0;->a(DJLa/csr;Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
