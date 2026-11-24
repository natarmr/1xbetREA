.class public final Lokhttp3/android/AndroidDns;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Dns;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/android/AndroidDns$AndroidQuery;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/android/AndroidDns;",
        "Lokhttp3/Dns;",
        "AndroidQuery",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lokhttp3/Dns$Request;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    invoke-direct {p0, p1, v0}, Lokhttp3/Dns$Request;-><init>(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    throw p0
.end method

.method public final b(Lokhttp3/Dns$Request;)Lokhttp3/Dns$Call;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method
