.class public interface abstract La/tf3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La/uf3;Ljava/lang/String;Ljava/util/Map;I)Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, La/lun;->a:La/lun;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :cond_0
    and-int/lit8 p3, p3, 0x10

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p3, 0x1

    .line 17
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance p0, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    const-string v1, ""

    .line 25
    .line 26
    invoke-direct {p0, p1, v0, p2, v1}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;

    .line 30
    .line 31
    const p2, 0x7f1311a1

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, p0, p2, p3}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZ)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method
