.class public final La/jej;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Locale;

.field public final b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final c:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final d:I

.field public final e:Ljava/lang/Integer;

.field public final f:La/pz40;


# direct methods
.method public constructor <init>(Ljava/util/Locale;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;ILjava/lang/Integer;La/pz40;)V
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
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/jej;->a:Ljava/util/Locale;

    .line 14
    .line 15
    iput-object p2, p0, La/jej;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 16
    .line 17
    iput-object p3, p0, La/jej;->c:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 18
    .line 19
    iput p4, p0, La/jej;->d:I

    .line 20
    .line 21
    iput-object p5, p0, La/jej;->e:Ljava/lang/Integer;

    .line 22
    .line 23
    iput-object p6, p0, La/jej;->f:La/pz40;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;
    .locals 1

    .line 1
    iget-object p0, p0, La/jej;->f:La/pz40;

    .line 2
    .line 3
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, v0, v0}, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-object p0
.end method
