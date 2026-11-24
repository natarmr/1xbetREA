.class public final La/iwt0;
.super La/r7x;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:La/t7u0;

.field public final c:La/m2a;


# direct methods
.method public constructor <init>(Ljava/lang/Object;La/t7u0;La/m2a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/iwt0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/iwt0;->b:La/t7u0;

    .line 7
    .line 8
    iput-object p3, p0, La/iwt0;->c:La/m2a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final D(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/r7x;
    .locals 2

    .line 1
    iget-object v0, p0, La/iwt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p2, La/kwo;

    .line 17
    .line 18
    iget-object v1, p0, La/iwt0;->c:La/m2a;

    .line 19
    .line 20
    iget-object p0, p0, La/iwt0;->b:La/t7u0;

    .line 21
    .line 22
    invoke-direct {p2, v0, p1, v1, p0}, La/kwo;-><init>(Ljava/lang/Object;Ljava/lang/String;La/m2a;La/t7u0;)V

    .line 23
    .line 24
    .line 25
    return-object p2
.end method

.method public final v()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/iwt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method
