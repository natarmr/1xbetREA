.class public final La/hdj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Locale;

.field public final b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final c:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final d:La/pz40;


# direct methods
.method public constructor <init>(Ljava/util/Locale;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;La/pz40;)V
    .locals 0

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/hdj;->a:Ljava/util/Locale;

    .line 14
    .line 15
    iput-object p2, p0, La/hdj;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 16
    .line 17
    iput-object p3, p0, La/hdj;->c:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 18
    .line 19
    iput-object p4, p0, La/hdj;->d:La/pz40;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;
    .locals 0

    .line 1
    iget-object p0, p0, La/hdj;->d:La/pz40;

    .line 2
    .line 3
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 8
    .line 9
    return-object p0
.end method
