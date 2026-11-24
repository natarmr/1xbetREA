.class public final La/ffj;
.super La/c2;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/Locale;

.field public final d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final f:La/pz40;


# direct methods
.method public constructor <init>(Ljava/util/Locale;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;La/pz40;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, v0, v0}, La/c2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/ffj;->c:Ljava/util/Locale;

    .line 15
    .line 16
    iput-object p2, p0, La/ffj;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 17
    .line 18
    iput-object p3, p0, La/ffj;->e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 19
    .line 20
    iput-object p4, p0, La/ffj;->f:La/pz40;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final E()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ffj;->Q()La/wk9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final Q()La/wk9;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffj;->f:La/pz40;

    .line 2
    .line 3
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wk9;

    .line 8
    .line 9
    return-object p0
.end method
