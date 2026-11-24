.class public final La/qtw$a;
.super La/zje;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/qtw;->resolve(La/yje;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field synthetic f:Ljava/lang/Object;

.field final synthetic g:La/qtw;

.field h:I


# direct methods
.method public constructor <init>(La/qtw;La/yje;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/qtw;",
            "La/yje<",
            "-",
            "La/qtw$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, La/qtw$a;->g:La/qtw;

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
    iput-object p1, p0, La/qtw$a;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/qtw$a;->h:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/qtw$a;->h:I

    .line 9
    .line 10
    iget-object p1, p0, La/qtw$a;->g:La/qtw;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/qtw;->resolve(La/yje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
