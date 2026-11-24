.class public final La/ft10;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:[Ljava/lang/String;

.field public j:[Ljava/lang/String;

.field public k:Ljava/util/Collection;

.field public l:Ljava/util/Collection;

.field public m:I

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/ot10;

.field public q:I


# direct methods
.method public constructor <init>(La/ot10;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ft10;->p:La/ot10;

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
    .locals 1

    .line 1
    iput-object p1, p0, La/ft10;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/ft10;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/ft10;->q:I

    .line 9
    .line 10
    iget-object p1, p0, La/ft10;->p:La/ot10;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/ot10;->k(La/zje;)Ljava/io/Serializable;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
